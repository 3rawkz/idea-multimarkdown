/*
 * Copyright (c) 2015-2015 Vladimir Schneider <vladimir.schneider@gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.vladsch.idea.multimarkdown.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.vladsch.idea.multimarkdown.psi.MultiMarkdownVisitor;
import com.vladsch.idea.multimarkdown.psi.MultiMarkdownWikiLink;
import com.vladsch.idea.multimarkdown.settings.MultiMarkdownGlobalSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MultiMarkdownWikiLinkImpl extends ASTWrapperPsiElement implements MultiMarkdownWikiLink {
    public static String getElementText(@NotNull String name, @Nullable String text) {
        boolean githubWikiLinks = MultiMarkdownGlobalSettings.getInstance().githubWikiLinks.getValue();

        return  githubWikiLinks
                ? "[[" + (text != null && text.length() > 0 && !name.equals(text) ? text + "|" : "") + name + "]]"
                : "[[" + name + (text != null && text.length() > 0 && !name.equals(text) ? "|" + text : "") + "]]"
                ;
    }

    public MultiMarkdownWikiLinkImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MultiMarkdownVisitor) ((MultiMarkdownVisitor) visitor).visitElement(this);
        else super.accept(visitor);
    }

    @Override
    public String getDisplayName() {
        return getText();
    }

    @Override
    public String getPageText() {
        return MultiMarkdownPsiImplUtil.getPageText(this);
    }

    @Override
    public String getPageRef() {
        return MultiMarkdownPsiImplUtil.getPageRef(this);
    }
}
