/*
 * Copyright (c) 2015-2015 Vladimir Schneider <vladimir.schneider@gmail.com>, all rights reserved.
 *
 * This code is private property of the copyright holder and cannot be used without
 * having obtained a license or prior written permission of the of the copyright holder.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package com.vladsch.idea.multimarkdown.util

import com.vladsch.idea.multimarkdown.printData
import com.vladsch.idea.multimarkdown.util.GitHubLinkInspector.*

// Auto-generated test data from: /Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md

class MarkdownTest__MarkdownTest_wiki__Home_md {
    companion object {
        //@Parameterized.Parameters(name = "{index}: filePath = {0}, linkRef = {3}, linkAnchor = {4}")
        @JvmStatic
        fun data(): Collection<Array<Any?>> {
            val cleanData = false
            val data = arrayListOf<Array<Any?>>(
                    /* @formatter:off */
                /*      arrayOf<Any?>("fullPath"                                              , "linkType"   , "linkText"         , "linkRef"                , "linkAnchor", "linkTitle", "resolvesLocal"                       , "resolvesExternal"                    , "linkAddress"         , "multiResolve") */
                /*  0 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Missing File"           , null        , null       , null                                  , null                                  , null                  , arrayOf<String>()) /*  0 */,
                /*  1 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "normal file"            , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file"         , arrayOf<String>()) /*  1 */,
                /*  2 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Non Vcs Page"           , null        , null       , "Non-Vcs-Page.md"                     , null                                  , "Non Vcs Page"        , arrayOf<String>()) /*  2 */,
                /*  3 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "normal file"            , "5"         , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file#5"       , arrayOf<String>()) /*  3 */,
                /*  4 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "normal file"      , "A Normal File"          , null        , null       , null                                  , null                                  , null                  , arrayOf<String>()) /*  4 */,
                /*  5 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "normal file"      , "In Name"                , null        , null       , "SubDirectory/In-Name.md"             , "SubDirectory/In-Name.md"             , "In Name"             , arrayOf<String>()) /*  5 */,
                /*  6 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "normal file.md"         , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file.md"      , arrayOf<String>()) /*  6 */,
                /*  7 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "normal file.mkd"        , null        , null       , null                                  , null                                  , null                  , arrayOf<String>("normal-file.md")) /*  7 */,
                /*  8 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "normal file.markdown"   , null        , null       , null                                  , null                                  , null                  , arrayOf<String>("normal-file.md")) /*  8 */,
                /*  9 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "normal file.mdk"        , null        , null       , null                                  , null                                  , null                  , arrayOf<String>("normal-file.md")) /*  9 */,
                /* 10 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "File In Subdirectory"   , null        , null       , "SubDirectory/File-In-Subdirectory.md", "SubDirectory/File-In-Subdirectory.md", "File In Subdirectory", arrayOf<String>()) /* 10 */,
                /* 11 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "normal file"      , "Normal File Text"       , null        , null       , null                                  , null                                  , null                  , arrayOf<String>()) /* 11 */,
                /* 12 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "anchor in name"         , "5"         , null       , "anchor-in-name#5.md"                 , "anchor-in-name#5.md"                 , "anchor in name#5"    , arrayOf<String>()) /* 12 */,
                /* 13 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "anchor in name"         , "5#5"       , null       , null                                  , null                                  , null                  , arrayOf<String>()) /* 13 */,
                /* 14 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Space In Name"          , null        , null       , "Space In Name.md"                    , "Space In Name.md"                    , "Space In Name"       , arrayOf<String>()) /* 14 */,
                /* 15 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Space In Name"          , "5"         , null       , "Space In Name.md"                    , "Space In Name.md"                    , "Space In Name#5"     , arrayOf<String>()) /* 15 */,
                /* 16 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Normal File"            , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file"         , arrayOf<String>()) /* 16 */,
                /* 17 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "normal-file"            , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file"         , arrayOf<String>()) /* 17 */,
                /* 18 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Normal-File"            , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file"         , arrayOf<String>()) /* 18 */,
                /* 19 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "In Name.md"             , null        , null       , null                                  , null                                  , null                  , arrayOf<String>("SubDirectory/In-Name.md")) /* 19 */,
                /* 20 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "SubDirectory/In Name"   , null        , null       , null                                  , null                                  , null                  , arrayOf<String>("SubDirectory/In-Name.md")) /* 20 */,
                /* 21 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "SubDirectory/In Name.md", null        , null       , null                                  , null                                  , null                  , arrayOf<String>("SubDirectory/In-Name.md")) /* 21 */,
                /* 22 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Multiple Match"         , null        , null       , "Multiple-Match.markdown"             , "Multiple-Match.markdown"             , "Multiple Match"      , arrayOf<String>("Multiple-Match.markdown", "Multiple-Match.md", "Multiple-Match.mkd", "SubDirectory/Multiple-Match.md")) /* 22 */,
                /* 23 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "../../NonWikiFile"      , null        , null       , null                                  , null                                  , null                  , arrayOf<String>()) /* 23 */,
                /* 24 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Not Wiki Ext"           , null        , null       , "Not-Wiki-Ext.mkd"                    , "Not-Wiki-Ext.mkd"                    , "Not Wiki Ext"        , arrayOf<String>()) /* 24 */,
                /* 25 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Not Wiki Ext 2"         , null        , null       , "Not-Wiki-Ext-2.markdown"             , "Not-Wiki-Ext-2.markdown"             , "Not Wiki Ext 2"      , arrayOf<String>()) /* 25 */,
                /* 26 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "Normal File Text" , "normal file"            , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file"         , arrayOf<String>()) /* 26 */,
                /* 27 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "normal file"      , "normal file"            , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file"         , arrayOf<String>()) /* 27 */,
                /* 28 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "Normal File"      , "normal file"            , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file"         , arrayOf<String>()) /* 28 */,
                /* 29 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "normal file"      , "Normal File"            , null        , null       , "normal-file.md"                      , "normal-file.md"                      , "normal file"         , arrayOf<String>()) /* 29 */,
                /* 30 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "only anchor"      , ""                       , "anchor"    , null       , null                                  , null                                  , null                  , arrayOf<String>("Home.md")) /* 30 */,
                /* 31 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, "only anchor fixed", "Home"                   , "anchor"    , null       , "Home.md"                             , "Home.md"                             , "Home#anchor"         , arrayOf<String>("Home.md")) /* 31 */,
                /* 32 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Test 4.2"               , null        , null       , "Test 4.2.md"                         , "Test 4.2.md"                         , "Test 4.2"            , arrayOf<String>()) /* 32 */,
                /* 33 */arrayOf<Any?>("/Users/vlad/src/MarkdownTest/MarkdownTest.wiki/Home.md", ::WikiLinkRef, ""                 , "Test Name.kt"           , null        , null       , "Test-Name.kt.md"                     , "Test-Name.kt.md"                     , "Test Name.kt"        , arrayOf<String>("Test-Name.kt.md", "Test-Name.kt")) /* 33 */
                /* @formatter:on */
            )

            if (cleanData) {
                val header = arrayOf(
                        "fullPath",
                        "linkType",
                        "linkText",
                        "linkRef",
                        "linkAnchor",
                        "linkTitle",
                        "resolvesLocal",
                        "resolvesExternal",
                        "linkAddress",
                        "multiResolve"
                )

                printData(data, header)
            }
            return data
        }

        @JvmStatic
        fun mismatchInfo(): Collection<Array<Any?>> {
            val cleanData = false
            val data = arrayListOf<Array<Any?>>(
                /* @formatter:off */
                /*      arrayOf<Any?>("dataRow", "inspectionResult"                , "severity"           , "fixedLinkRef"           , "fixedFilePath") */
                /*  0 */arrayOf<Any?>(2        , "ID_TARGET_NOT_UNDER_VCS"         , Severity.WARNING     , null                     , null) /*  0 */,
                /*  1 */arrayOf<Any?>(6        , "ID_LINK_TARGETS_WIKI_HAS_EXT"    , Severity.WARNING     , "normal file"            , null) /*  1 */,
                /*  2 */arrayOf<Any?>(7        , "ID_LINK_TARGETS_WIKI_HAS_EXT"    , Severity.WARNING     , "normal file"            , null) /*  2 */,
                /*  3 */arrayOf<Any?>(7        , "ID_LINK_TARGETS_WIKI_HAS_BAD_EXT", Severity.ERROR       , "normal file.md"         , null) /*  3 */,
                /*  4 */arrayOf<Any?>(8        , "ID_LINK_TARGETS_WIKI_HAS_EXT"    , Severity.WARNING     , "normal file"            , null) /*  4 */,
                /*  5 */arrayOf<Any?>(8        , "ID_LINK_TARGETS_WIKI_HAS_BAD_EXT", Severity.ERROR       , "normal file.md"         , null) /*  5 */,
                /*  6 */arrayOf<Any?>(12       , "ID_TARGET_NAME_HAS_ANCHOR"       , Severity.WARNING     , null                     , "anchor-in-name5.md") /*  6 */,
                /*  7 */arrayOf<Any?>(14       , "ID_TARGET_HAS_SPACES"            , Severity.WEAK_WARNING, null                     , "Space-In-Name.md") /*  7 */,
                /*  8 */arrayOf<Any?>(15       , "ID_TARGET_HAS_SPACES"            , Severity.WEAK_WARNING, null                     , "Space-In-Name.md") /*  8 */,
                /*  9 */arrayOf<Any?>(16       , "ID_CASE_MISMATCH"                , Severity.WARNING     , "normal file"            , "Normal-File.md") /*  9 */,
                /* 10 */arrayOf<Any?>(17       , "ID_WIKI_LINK_HAS_DASHES"         , Severity.WEAK_WARNING, "normal file"            , null) /* 10 */,
                /* 11 */arrayOf<Any?>(18       , "ID_CASE_MISMATCH"                , Severity.WARNING     , "normal file"            , "Normal-File.md") /* 11 */,
                /* 12 */arrayOf<Any?>(18       , "ID_WIKI_LINK_HAS_DASHES"         , Severity.WEAK_WARNING, "Normal File"            , null) /* 12 */,
                /* 13 */arrayOf<Any?>(19       , "ID_LINK_TARGETS_WIKI_HAS_EXT"    , Severity.WARNING     , "In Name"                , null) /* 13 */,
                /* 14 */arrayOf<Any?>(20       , "ID_WIKI_LINK_HAS_SUBDIR"         , Severity.ERROR       , "In Name"                , null) /* 14 */,
                /* 15 */arrayOf<Any?>(21       , "ID_LINK_TARGETS_WIKI_HAS_EXT"    , Severity.WARNING     , "In Name"                , null) /* 15 */,
                /* 16 */arrayOf<Any?>(21       , "ID_WIKI_LINK_HAS_SLASH"          , Severity.ERROR       , "SubDirectory/In Name.md", null) /* 16 */,
                /* 17 */arrayOf<Any?>(29       , "ID_CASE_MISMATCH"                , Severity.WARNING     , "normal file"            , "Normal-File.md") /* 17 */,
                /* 18 */arrayOf<Any?>(30       , "ID_WIKI_LINK_HAS_ONLY_ANCHOR"    , Severity.ERROR       , "Home"                   , null) /* 18 */,
                /* 19 */arrayOf<Any?>(32       , "ID_TARGET_HAS_SPACES"            , Severity.WEAK_WARNING, null                     , "Test-4.2.md") /* 19 */
                /* @formatter:on */
            )

            if (cleanData) {
                val header = arrayOf(
                        "dataRow",
                        "inspectionResult",
                        "severity",
                        "fixedLinkRef",
                        "fixedFilePath"
                )

                printData(data, header)
            }
            return data
        }
    }
}
