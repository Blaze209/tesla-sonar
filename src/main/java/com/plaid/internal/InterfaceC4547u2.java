package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.result.LinkResult;
import java.util.LinkedHashMap;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4547u2 {
    Object a(AbstractC4587y6 abstractC4587y6, ContinuationImpl continuationImpl);

    Object a(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl);

    Object a(ContinuationImpl continuationImpl);

    Object a(Pane$PaneOutput[] pane$PaneOutputArr, ContinuationImpl continuationImpl);

    void a(AbstractC4531s4 abstractC4531s4);

    void a(LinkResult linkResult);

    void a(String str);

    Object b(ContinuationImpl continuationImpl);
}
