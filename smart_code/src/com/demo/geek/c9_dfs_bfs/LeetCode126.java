package com.demo.geek.c9_dfs_bfs;

import java.util.List;

/**
 * LeetCode126
 * 单词接龙2
 * @author liuzhen
 * @version 1.0.0 2021/8/16 14:07
 */
public class LeetCode126 {

    /**
     * 按字典 wordList 完成从单词 beginWord 到单词 endWord 转化，一个表示此过程的转换序列是形式上像 beginWord -> s1 -> s2 -> ... -> sk 这样的单词序列，
     * 并满足：每对相邻的单词之间仅有单个字母不同。
     * 转换过程中的每个单词 si（1 <= i <= k）必须是字典 wordList 中的单词。注意，beginWord 不必是字典 wordList 中的单词。sk == endWord
     * 给你两个单词 beginWord 和 endWord ，以及一个字典 wordList 。请你找出并返回所有从 beginWord 到 endWord 的 最短转换序列 ，如果不存在这样的转换序列，
     * 返回一个空列表。每个序列都应该以单词列表 [beginWord, s1, s2, ..., sk] 的形式返回。
     *
     * 示例 1：
     * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
     * 输出：[["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
     * 解释：存在 2 种最短的转换序列：
     * "hit" -> "hot" -> "dot" -> "dog" -> "cog"
     * "hit" -> "hot" -> "lot" -> "log" -> "cog"
     *
     * 示例 2：
     * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
     * 输出：[]
     * 解释：endWord "cog" 不在字典 wordList 中，所以不存在符合要求的转换序列。
     *  
     * 提示：
     * 1 <= beginWord.length <= 7
     * endWord.length == beginWord.length
     * 1 <= wordList.length <= 5000
     * wordList[i].length == beginWord.length
     * beginWord、endWord 和 wordList[i] 由小写英文字母组成
     * beginWord != endWord
     * wordList 中的所有单词 互不相同
     */

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        return null;
    }
}
