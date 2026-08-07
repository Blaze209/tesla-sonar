package b4;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\r\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0012\u0010\u000e\u001a/\u0010\u0013\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lb4/j;", "", Action.KEY_ATTRIBUTE, "Lb4/x1;", "a", "(Lb4/j;Ljava/lang/Object;)Lb4/x1;", "T", "b", "(Lb4/x1;)Lb4/x1;", "Lkotlin/Function1;", "", "block", "Ljn0/h0;", "c", "(Lb4/j;Ljava/lang/Object;Lwn0/l;)V", DateTokenConverter.CONVERTER_KEY, "(Lb4/x1;Lwn0/l;)V", "Lb4/w1;", "e", "f", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    public static final x1 a(j jVar, Object obj) {
        x0 nodes;
        int iA = b1.a(262144);
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c parent = jVar.getNode().getParent();
        g0 g0VarM = k.m(jVar);
        while (g0VarM != null) {
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        androidx.compose.ui.d.c cVarG = parent;
                        t2.b bVar = null;
                        while (cVarG != 0) {
                            if (cVarG instanceof x1) {
                                x1 x1Var = (x1) cVarG;
                                if (p013kotlin.jvm.internal.s.f(obj, x1Var.getTraverseKey())) {
                                    return x1Var;
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                                androidx.compose.ui.d.c delegate = ((m) cVarG).getDelegate();
                                int i11 = 0;
                                cVarG = cVarG;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != 0) {
                                                bVar.b(cVarG);
                                                cVarG = 0;
                                            }
                                            bVar.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    cVarG = cVarG;
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            g0VarM = g0VarM.n0();
            parent = (g0VarM == null || (nodes = g0VarM.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    public static final <T extends x1> T b(T t11) {
        x0 nodes;
        int iA = b1.a(262144);
        if (!t11.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.d.c parent = t11.getNode().getParent();
        g0 g0VarM = k.m(t11);
        while (g0VarM != null) {
            if ((g0VarM.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        androidx.compose.ui.d.c cVarG = parent;
                        t2.b bVar = null;
                        while (cVarG != 0) {
                            if (cVarG instanceof x1) {
                                T t12 = (T) cVarG;
                                if (p013kotlin.jvm.internal.s.f(t11.getTraverseKey(), t12.getTraverseKey()) && d3.b.a(t11, t12)) {
                                    return t12;
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                                androidx.compose.ui.d.c delegate = ((m) cVarG).getDelegate();
                                int i11 = 0;
                                cVarG = cVarG;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != 0) {
                                                bVar.b(cVarG);
                                                cVarG = 0;
                                            }
                                            bVar.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    cVarG = cVarG;
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            g0VarM = g0VarM.n0();
            parent = (g0VarM == null || (nodes = g0VarM.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final void c(b4.j r10, java.lang.Object r11, wn0.l<? super b4.x1, java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.y1.c(b4.j, java.lang.Object, wn0.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final <T extends b4.x1> void d(T r11, wn0.l<? super T, java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.y1.d(b4.x1, wn0.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final void e(b4.j r12, java.lang.Object r13, wn0.l<? super b4.x1, ? extends b4.w1> r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.y1.e(b4.j, java.lang.Object, wn0.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final <T extends b4.x1> void f(T r13, wn0.l<? super T, ? extends b4.w1> r14) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.y1.f(b4.x1, wn0.l):void");
    }
}
