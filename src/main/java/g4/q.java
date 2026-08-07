package g4;

import b4.b1;
import b4.g0;
import b4.s1;
import b4.x0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import okhttp3.internal.http2.Http2Connection;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\r\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lb4/g0;", "layoutNode", "", "mergingEnabled", "Lg4/p;", "a", "(Lb4/g0;Z)Lg4/p;", "Lkotlin/Function1;", "selector", "f", "(Lb4/g0;Lwn0/l;)Lb4/g0;", "", "e", "(Lg4/p;)I", IntegerTokenConverter.CONVERTER_KEY, "Lb4/s1;", "g", "(Lb4/g0;)Lb4/s1;", "outerMergingSemantics", "Lg4/i;", "h", "(Lg4/p;)Lg4/i;", "role", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a A[EDGE_INSN: B:41:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    public static final p a(g0 g0Var, boolean z11) {
        x0 nodes = g0Var.getNodes();
        int iA = b1.a(8);
        Object obj = null;
        if ((nodes.i() & iA) != 0) {
            loop0: for (androidx.compose.ui.d.c head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) == 0) {
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    androidx.compose.ui.d.c cVarG = head;
                    t2.b bVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof s1) {
                            obj = cVarG;
                            break loop0;
                        }
                        if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                            int i11 = 0;
                            for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVarG = delegate;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            bVar.b(cVarG);
                                            cVarG = null;
                                        }
                                        bVar.b(delegate);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVarG = b4.k.g(bVar);
                    }
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        p013kotlin.jvm.internal.s.h(obj);
        androidx.compose.ui.d.c node = ((s1) obj).getNode();
        l lVarH = g0Var.H();
        p013kotlin.jvm.internal.s.h(lVarH);
        return new p(node, z11, g0Var, lVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(p pVar) {
        return pVar.getId() + 2000000000;
    }

    public static final g0 f(g0 g0Var, wn0.l<? super g0, Boolean> lVar) {
        for (g0 g0VarN0 = g0Var.n0(); g0VarN0 != null; g0VarN0 = g0VarN0.n0()) {
            if (lVar.invoke(g0VarN0).booleanValue()) {
                return g0VarN0;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    public static final s1 g(g0 g0Var) {
        x0 nodes = g0Var.getNodes();
        int iA = b1.a(8);
        Object obj = null;
        if ((nodes.i() & iA) != 0) {
            loop0: for (androidx.compose.ui.d.c head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) == 0) {
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    androidx.compose.ui.d.c cVarG = head;
                    t2.b bVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof s1) {
                            if (((s1) cVarG).getMergeDescendants()) {
                                obj = cVarG;
                                break loop0;
                            }
                        } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                            int i11 = 0;
                            for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVarG = delegate;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            bVar.b(cVarG);
                                            cVarG = null;
                                        }
                                        bVar.b(delegate);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVarG = b4.k.g(bVar);
                    }
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        return (s1) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i h(p pVar) {
        return (i) m.a(pVar.getUnmergedConfig(), s.f67271a.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(p pVar) {
        return pVar.getId() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }
}
