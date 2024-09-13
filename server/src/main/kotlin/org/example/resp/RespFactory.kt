package org.example.resp

import io.github.yinjinlong.spring.boot.exception.BaseClientException
import io.github.yinjinlong.spring.boot.response.JsonResponse

/**
 * 响应生成工厂，在`application.yaml` 的`spring.responseJsonFactory` 注册
 * @author YJL
 */
object RespFactory {
    @JvmStatic
    fun ok(data: Any?) = RespJson(RespJson.Code.OK, data)

    @JvmStatic
    fun error(e: Exception): JsonResponse {
        return if (e is BaseClientException)
            clientError(e)
        else
            serverError(e)
    }

    fun clientError(e: BaseClientException) = RespJson(e.errorCode, e.message, e.data)

    fun serverError(e: Exception) = RespJson(RespJson.Code.SERVER_ERROR /* , e.message*/)
}

