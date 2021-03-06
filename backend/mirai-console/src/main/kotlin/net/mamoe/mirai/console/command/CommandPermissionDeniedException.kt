/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.console.command

/**
 * 在 [executeCommand] 中, [CommandSender] 未拥有 [Command.permission] 所要求的权限时抛出的异常.
 *
 * 总是作为 [CommandExecutionException.cause].
 */
class CommandPermissionDeniedException(
    /**
     * 执行过程发生异常的指令
     */
    val command: Command
) : RuntimeException("Permission denied while executing command '${command.primaryName}'") {
    override fun toString(): String =
        "CommandPermissionDeniedException(command=$command)"
}