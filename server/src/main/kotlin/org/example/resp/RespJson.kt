package org.example.resp

import io.github.yinjinlong.spring.boot.response.JsonResponse

/**
 * 响应对象
 */
open class RespJson(
    val code: Int,
    val msg: String?,
    val data: Any?
) : JsonResponse {

    constructor(code: Code, data: Any? = null) : this(code.code, code.msg, data)

    enum class Code(val code: Int, val msg: String) {
        OK(0, "OK"),
        BAD_REQUEST(1000, "Bad Request"),
        SERVER_ERROR(10000, "Server Error")
    }

}