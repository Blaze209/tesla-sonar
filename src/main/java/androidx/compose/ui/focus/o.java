package androidx.compose.ui.focus;

import b4.b1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0000¢\u0006\u0004\b\f\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/o;", "", "<init>", "()V", "Ljn0/h0;", "f", "", DateTokenConverter.CONVERTER_KEY, "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "c", "(Lwn0/l;)Z", "Lt2/b;", "Li3/n;", "a", "Lt2/b;", "e", "()Lt2/b;", "focusRequesterNodes", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f5383c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o f5384d = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t2.b<i3.n> focusRequesterNodes = new t2.b<>(new i3.n[16], 0);

    /* JADX INFO: renamed from: androidx.compose.ui.focus.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/o$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/o;", "Default", "Landroidx/compose/ui/focus/o;", "b", "()Landroidx/compose/ui/focus/o;", "Cancel", "a", "getCancel$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return o.f5384d;
        }

        public final o b() {
            return o.f5383c;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5386c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(s.j(focusTargetNode));
        }
    }

    public final boolean c(wn0.l<? super FocusTargetNode, Boolean> onFound) {
        Companion companion = INSTANCE;
        if (this == companion.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == companion.a()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (!this.focusRequesterNodes.q()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        t2.b<i3.n> bVar = this.focusRequesterNodes;
        int iN = bVar.getSize();
        if (iN <= 0) {
            return false;
        }
        i3.n[] nVarArrM = bVar.m();
        int i11 = 0;
        boolean z11 = false;
        do {
            i3.n nVar = nVarArrM[i11];
            int iA = b1.a(1024);
            if (!nVar.getNode().getIsAttached()) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            t2.b bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
            androidx.compose.ui.d.c child = nVar.getNode().getChild();
            if (child == null) {
                b4.k.c(bVar2, nVar.getNode());
            } else {
                bVar2.b(child);
            }
            while (bVar2.q()) {
                androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar2.v(bVar2.getSize() - 1);
                if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                    b4.k.c(bVar2, cVarG);
                } else {
                    while (cVarG != null) {
                        if ((cVarG.getKindSet() & iA) != 0) {
                            t2.b bVar3 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                                    if (focusTargetNode.C2().v() ? onFound.invoke(focusTargetNode).booleanValue() : w.k(focusTargetNode, d.INSTANCE.b(), onFound)) {
                                        z11 = true;
                                        break;
                                    }
                                } else if (((cVarG.getKindSet() & iA) != 0) && (cVarG instanceof b4.m)) {
                                    int i12 = 0;
                                    for (androidx.compose.ui.d.c cVarY2 = ((b4.m) cVarG).getDelegate(); cVarY2 != null; cVarY2 = cVarY2.getChild()) {
                                        if ((cVarY2.getKindSet() & iA) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                cVarG = cVarY2;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    bVar3.b(cVarG);
                                                    cVarG = null;
                                                }
                                                bVar3.b(cVarY2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                cVarG = b4.k.g(bVar3);
                            }
                            break;
                        }
                        cVarG = cVarG.getChild();
                    }
                }
            }
            i11++;
        } while (i11 < iN);
        return z11;
    }

    public final boolean d() {
        return c(b.f5386c);
    }

    public final t2.b<i3.n> e() {
        return this.focusRequesterNodes;
    }

    public final void f() {
        d();
    }
}
