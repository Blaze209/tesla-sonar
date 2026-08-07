package com.plaid.internal;

import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import java.util.LinkedHashMap;
import kotlinx.serialization.SerializationException;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4538t2 implements InterfaceC4547u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G2 f48126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z2 f48127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y2 f48128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t8 f48129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x8 f48130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s8 f48131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w8 f48132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v8 f48133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A0 f48134i;

    public C4538t2(G2 navigator, Z2 linkStateStore, Y2 linkStateReducer, t8 writeOAuthRedirectUri, x8 writeWebviewFallbackUri, s8 writeChannelInfo, w8 writeWebviewFallbackId, v8 writeWebviewBackgroundTransparencyState, A0 destinationFactory) {
        p013kotlin.jvm.internal.s.k(navigator, "navigator");
        p013kotlin.jvm.internal.s.k(linkStateStore, "linkStateStore");
        p013kotlin.jvm.internal.s.k(linkStateReducer, "linkStateReducer");
        p013kotlin.jvm.internal.s.k(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        p013kotlin.jvm.internal.s.k(writeWebviewFallbackUri, "writeWebviewFallbackUri");
        p013kotlin.jvm.internal.s.k(writeChannelInfo, "writeChannelInfo");
        p013kotlin.jvm.internal.s.k(writeWebviewFallbackId, "writeWebviewFallbackId");
        p013kotlin.jvm.internal.s.k(writeWebviewBackgroundTransparencyState, "writeWebviewBackgroundTransparencyState");
        p013kotlin.jvm.internal.s.k(destinationFactory, "destinationFactory");
        this.f48126a = navigator;
        this.f48127b = linkStateStore;
        this.f48128c = linkStateReducer;
        this.f48129d = writeOAuthRedirectUri;
        this.f48130e = writeWebviewFallbackUri;
        this.f48131f = writeChannelInfo;
        this.f48132g = writeWebviewFallbackId;
        this.f48133h = writeWebviewBackgroundTransparencyState;
        this.f48134i = destinationFactory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r8.a(r9, r0) == r1) goto L28;
     */
    @Override // com.plaid.internal.InterfaceC4547u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[] r8, p013kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.plaid.internal.C4494o2
            if (r0 == 0) goto L13
            r0 = r9
            com.plaid.internal.o2 r0 = (com.plaid.internal.C4494o2) r0
            int r1 = r0.f47981f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47981f = r1
            goto L18
        L13:
            com.plaid.internal.o2 r0 = new com.plaid.internal.o2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f47979d
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47981f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            jn0.t.b(r9)
            goto L9d
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.plaid.internal.t2 r8 = r0.f47976a
            jn0.t.b(r9)
            goto L7a
        L3f:
            com.plaid.internal.Y2 r8 = r0.f47978c
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[] r2 = r0.f47977b
            com.plaid.internal.t2 r5 = r0.f47976a
            jn0.t.b(r9)
            goto L64
        L49:
            jn0.t.b(r9)
            com.plaid.internal.Y2 r9 = r7.f48128c
            com.plaid.internal.Z2 r2 = r7.f48127b
            r0.f47976a = r7
            r0.f47977b = r8
            r0.f47978c = r9
            r0.f47981f = r5
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L5f
            goto L9c
        L5f:
            r5 = r2
            r2 = r8
            r8 = r9
            r9 = r5
            r5 = r7
        L64:
            com.plaid.internal.N2 r9 = (com.plaid.internal.N2) r9
            java.util.List r2 = p013kotlin.collections.n.w1(r2)
            r0.f47976a = r5
            r0.f47977b = r6
            r0.f47978c = r6
            r0.f47981f = r4
            java.lang.Object r9 = r8.a(r9, r2, r0)
            if (r9 != r1) goto L79
            goto L9c
        L79:
            r8 = r5
        L7a:
            com.plaid.internal.N2 r9 = (com.plaid.internal.N2) r9
            com.plaid.internal.X5$a r2 = com.plaid.internal.X5.f46812a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Next "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.plaid.internal.X5.a.a(r2, r4)
            r0.f47976a = r6
            r0.f47981f = r3
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L9d
        L9c:
            return r1
        L9d:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4538t2.a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[], kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r2.a(r9, r0) == r1) goto L27;
     */
    @Override // com.plaid.internal.InterfaceC4547u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p013kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.plaid.internal.C4520r2
            if (r0 == 0) goto L13
            r0 = r9
            com.plaid.internal.r2 r0 = (com.plaid.internal.C4520r2) r0
            int r1 = r0.f48089d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48089d = r1
            goto L18
        L13:
            com.plaid.internal.r2 r0 = new com.plaid.internal.r2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f48087b
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f48089d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            jn0.t.b(r9)
            goto L9d
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            com.plaid.internal.t2 r2 = r0.f48086a
            jn0.t.b(r9)
            goto L79
        L3d:
            com.plaid.internal.t2 r2 = r0.f48086a
            jn0.t.b(r9)
            goto L54
        L43:
            jn0.t.b(r9)
            com.plaid.internal.Z2 r9 = r8.f48127b
            r0.f48086a = r8
            r0.f48089d = r5
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L53
            goto L9c
        L53:
            r2 = r8
        L54:
            com.plaid.internal.N2 r9 = (com.plaid.internal.N2) r9
            com.plaid.internal.X5$a r5 = com.plaid.internal.X5.f46812a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Start from "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.plaid.internal.X5.a.a(r5, r6)
            com.plaid.internal.Y2 r5 = r2.f48128c
            r0.f48086a = r2
            r0.f48089d = r4
            java.lang.Object r9 = com.plaid.internal.Y2.a(r5, r9, r0)
            if (r9 != r1) goto L79
            goto L9c
        L79:
            com.plaid.internal.N2 r9 = (com.plaid.internal.N2) r9
            com.plaid.internal.X5$a r4 = com.plaid.internal.X5.f46812a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Start next "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.plaid.internal.X5.a.a(r4, r5)
            r4 = 0
            r0.f48086a = r4
            r0.f48089d = r3
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L9d
        L9c:
            return r1
        L9d:
            jn0.h0 r9 = jn0.h0.f84049a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4538t2.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r2.a(r9, r0) == r1) goto L28;
     */
    @Override // com.plaid.internal.InterfaceC4547u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p013kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.plaid.internal.C4503p2
            if (r0 == 0) goto L13
            r0 = r9
            com.plaid.internal.p2 r0 = (com.plaid.internal.C4503p2) r0
            int r1 = r0.f48033e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48033e = r1
            goto L18
        L13:
            com.plaid.internal.p2 r0 = new com.plaid.internal.p2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f48031c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f48033e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            jn0.t.b(r9)
            goto L8e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            com.plaid.internal.t2 r2 = r0.f48029a
            jn0.t.b(r9)
            goto L6b
        L3e:
            com.plaid.internal.Y2 r2 = r0.f48030b
            com.plaid.internal.t2 r6 = r0.f48029a
            jn0.t.b(r9)
            goto L5b
        L46:
            jn0.t.b(r9)
            com.plaid.internal.Y2 r2 = r8.f48128c
            com.plaid.internal.Z2 r9 = r8.f48127b
            r0.f48029a = r8
            r0.f48030b = r2
            r0.f48033e = r6
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L5a
            goto L8d
        L5a:
            r6 = r8
        L5b:
            com.plaid.internal.N2 r9 = (com.plaid.internal.N2) r9
            r0.f48029a = r6
            r0.f48030b = r3
            r0.f48033e = r5
            java.lang.Object r9 = r2.b(r9, r0)
            if (r9 != r1) goto L6a
            goto L8d
        L6a:
            r2 = r6
        L6b:
            com.plaid.internal.N2 r9 = (com.plaid.internal.N2) r9
            com.plaid.internal.X5$a r5 = com.plaid.internal.X5.f46812a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Previous "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.plaid.internal.X5.a.a(r5, r6)
            r0.f48029a = r3
            r0.f48033e = r4
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L8e
        L8d:
            return r1
        L8e:
            jn0.h0 r9 = jn0.h0.f84049a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4538t2.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[PHI: r12 r13
      0x00b7: PHI (r12v7 com.plaid.internal.t2) = (r12v4 com.plaid.internal.t2), (r12v12 com.plaid.internal.t2) binds: [B:33:0x00b4, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r13v9 java.lang.Object) = (r13v7 java.lang.Object), (r13v1 java.lang.Object) binds: [B:33:0x00b4, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r12.a(r13, r0) == r1) goto L37;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b7, please report this as an issue */
    @Override // com.plaid.internal.InterfaceC4547u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.plaid.internal.AbstractC4587y6 r12, p013kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4538t2.a(com.plaid.internal.y6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.plaid.internal.InterfaceC4547u2
    public final void a(LinkResult linkResult) {
        AbstractC4590z0 destination;
        p013kotlin.jvm.internal.s.k(linkResult, "linkResult");
        G2 g11 = this.f48126a;
        if (linkResult instanceof LinkSuccess) {
            destination = new AbstractC4590z0.j((LinkSuccess) linkResult);
        } else {
            if (!(linkResult instanceof LinkExit)) {
                throw new IllegalArgumentException("Link result is not a valid result of LinkSuccess or LinkExit");
            }
            destination = new AbstractC4590z0.d((LinkExit) linkResult);
        }
        g11.getClass();
        p013kotlin.jvm.internal.s.k(destination, "destination");
        g11.f46322a.postValue(destination);
    }

    @Override // com.plaid.internal.InterfaceC4547u2
    public final void a(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        G2 g11 = this.f48126a;
        AbstractC4590z0.f destination = new AbstractC4590z0.f(url);
        g11.getClass();
        p013kotlin.jvm.internal.s.k(destination, "destination");
        g11.f46322a.postValue(destination);
    }

    @Override // com.plaid.internal.InterfaceC4547u2
    public final void a(AbstractC4531s4 openMethod) {
        p013kotlin.jvm.internal.s.k(openMethod, "openMethod");
        G2 g11 = this.f48126a;
        AbstractC4590z0.g destination = new AbstractC4590z0.g(openMethod);
        g11.getClass();
        p013kotlin.jvm.internal.s.k(destination, "destination");
        g11.f46322a.postValue(destination);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.plaid.internal.InterfaceC4547u2
    public final Object a(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        C4476m2 c4476m2;
        if (continuationImpl instanceof C4476m2) {
            c4476m2 = (C4476m2) continuationImpl;
            int i11 = c4476m2.f47869c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4476m2.f47869c = i11 - Integer.MIN_VALUE;
            } else {
                c4476m2 = new C4476m2(this, continuationImpl);
            }
        } else {
            c4476m2 = new C4476m2(this, continuationImpl);
        }
        Object obj = c4476m2.f47867a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4476m2.f47869c;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                wo0.b bVarB = wo0.u.b(null, C4485n2.f47923a, 1, null);
                String str = (String) linkedHashMap.get("webview");
                if (str == null) {
                    str = "";
                }
                C4558v4 c4558v4 = (C4558v4) bVarB.d(C4558v4.a.f48179a, str);
                String str2 = "";
                String str3 = "";
                String str4 = "";
                String str5 = "";
                N2 kVar = new N2.k(str2, str3, str4, str5, c4558v4.f48176b, c4558v4.f48177c, c4558v4.f48178d, false, null, 1152);
                c4476m2.f47869c = 1;
                if (a(kVar, c4476m2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
        } catch (SerializationException unused) {
            L2.b(new C4342a1("Failed to parse webview json"), null);
        }
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[PHI: r2 r8
      0x00b0: PHI (r2v9 com.plaid.internal.t2) = (r2v6 com.plaid.internal.t2), (r2v6 com.plaid.internal.t2), (r2v11 com.plaid.internal.t2) binds: [B:26:0x009b, B:28:0x00ac, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r8v3 com.plaid.internal.N2) = (r8v1 com.plaid.internal.N2), (r8v1 com.plaid.internal.N2), (r8v4 com.plaid.internal.N2) binds: [B:26:0x009b, B:28:0x00ac, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd A[PHI: r2 r8
      0x00dd: PHI (r2v16 com.plaid.internal.t2) = (r2v12 com.plaid.internal.t2), (r2v12 com.plaid.internal.t2), (r2v18 com.plaid.internal.t2) binds: [B:37:0x00cb, B:39:0x00da, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r8v8 com.plaid.internal.N2) = (r8v5 com.plaid.internal.N2), (r8v5 com.plaid.internal.N2), (r8v9 com.plaid.internal.N2) binds: [B:37:0x00cb, B:39:0x00da, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7 A[PHI: r2 r8
      0x00f7: PHI (r2v19 com.plaid.internal.t2) = 
      (r2v1 com.plaid.internal.t2)
      (r2v16 com.plaid.internal.t2)
      (r2v16 com.plaid.internal.t2)
      (r2v21 com.plaid.internal.t2)
     binds: [B:46:0x00f6, B:42:0x00e2, B:44:0x00f3, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r8v10 com.plaid.internal.N2) = (r8v0 com.plaid.internal.N2), (r8v8 com.plaid.internal.N2), (r8v8 com.plaid.internal.N2), (r8v11 com.plaid.internal.N2) binds: [B:46:0x00f6, B:42:0x00e2, B:44:0x00f3, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0107 A[PHI: r2 r8
      0x0107: PHI (r2v22 com.plaid.internal.t2) = (r2v19 com.plaid.internal.t2), (r2v25 com.plaid.internal.t2) binds: [B:48:0x0104, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r8v12 com.plaid.internal.N2) = (r8v10 com.plaid.internal.N2), (r8v15 com.plaid.internal.N2) binds: [B:48:0x0104, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        if (r4.a(r9, r0) == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.plaid.internal.N2 r8, p013kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4538t2.a(com.plaid.internal.N2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
