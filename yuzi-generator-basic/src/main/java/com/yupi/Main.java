package com.yupi;

import com.yupi.cli.CommandExecutor;


/**
 * 主要
 *
 * @author JiangJie
 * @date 2024/01/04
 */
public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}