package i3;

import androidx.collection.l0;
import androidx.collection.w0;
import androidx.compose.ui.focus.FocusTargetNode;
import b4.b1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001f¨\u0006$"}, d2 = {"Li3/e;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Ljn0/h0;", "onRequestApplyChangesListener", "invalidateOwnerFocusState", "<init>", "(Lwn0/l;Lwn0/a;)V", "T", "Landroidx/collection/l0;", "node", DateTokenConverter.CONVERTER_KEY, "(Landroidx/collection/l0;Ljava/lang/Object;)V", "c", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Li3/c;", "f", "(Li3/c;)V", "Li3/j;", "g", "(Li3/j;)V", "", "b", "()Z", "a", "Lwn0/l;", "Lwn0/a;", "Landroidx/collection/l0;", "focusTargetNodes", "focusEventNodes", "focusPropertiesNodes", "focusTargetsWithInvalidatedFocusEvents", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<wn0.a<h0>, h0> onRequestApplyChangesListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> invalidateOwnerFocusState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l0<FocusTargetNode> focusTargetNodes = w0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l0<c> focusEventNodes = w0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l0<j> focusPropertiesNodes = w0.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l0<FocusTargetNode> focusTargetsWithInvalidatedFocusEvents = w0.a();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
        a(Object obj) {
            super(0, obj, e.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((e) this.receiver).c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(wn0.l<? super wn0.a<h0>, h0> lVar, wn0.a<h0> aVar) {
        this.onRequestApplyChangesListener = lVar;
        this.invalidateOwnerFocusState = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    public final void c() {
        char c11;
        long j11;
        long j12;
        int i11;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        long j13;
        int i12;
        o oVarE2;
        int i13;
        t2.b bVar;
        Object[] objArr3;
        long j14;
        long j15;
        long[] jArr3;
        long[] jArr4;
        int i14;
        long[] jArr5;
        int i15;
        l0<j> l0Var = this.focusPropertiesNodes;
        Object[] objArr4 = l0Var.elements;
        long[] jArr6 = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr6.length - 2;
        char c12 = 7;
        int i16 = 16;
        int i17 = 8;
        int i18 = 1;
        int i19 = 0;
        if (length >= 0) {
            int i21 = 0;
            j11 = 255;
            while (true) {
                long j16 = jArr6[i21];
                j12 = -9187201950435737472L;
                if ((((~j16) << c12) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    int i23 = i19;
                    while (i23 < i22) {
                        if ((j16 & 255) < 128) {
                            j jVar = (j) objArr4[(i21 << 3) + i23];
                            if (jVar.getNode().getIsAttached()) {
                                int iA = b1.a(1024);
                                androidx.compose.ui.d.c node = jVar.getNode();
                                t2.b bVar2 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        this.focusTargetNodes.h((FocusTargetNode) node);
                                    } else if ((node.getKindSet() & iA) != 0 && (node instanceof b4.m)) {
                                        androidx.compose.ui.d.c delegate = ((b4.m) node).getDelegate();
                                        i15 = i17;
                                        int i24 = i19;
                                        while (delegate != null) {
                                            if ((delegate.getKindSet() & iA) != 0) {
                                                i24++;
                                                if (i24 == i18) {
                                                    jArr6 = jArr6;
                                                    node = delegate;
                                                } else {
                                                    t2.b bVar3 = bVar2 == null ? new t2.b(new androidx.compose.ui.d.c[i16], i19) : bVar2;
                                                    if (node != null) {
                                                        bVar3.b(node);
                                                        node = null;
                                                    }
                                                    bVar3.b(delegate);
                                                    bVar2 = bVar3;
                                                }
                                            } else {
                                                jArr6 = jArr6;
                                            }
                                            delegate = delegate.getChild();
                                            jArr6 = jArr6;
                                            i18 = 1;
                                        }
                                        jArr5 = jArr6;
                                        int i25 = i18;
                                        if (i24 == i25) {
                                            i18 = i25;
                                            i17 = i15;
                                            jArr6 = jArr5;
                                        } else {
                                            node = b4.k.g(bVar2);
                                            i17 = i15;
                                            jArr6 = jArr5;
                                            i18 = 1;
                                        }
                                    }
                                    jArr5 = jArr6;
                                    i15 = i17;
                                    node = b4.k.g(bVar2);
                                    i17 = i15;
                                    jArr6 = jArr5;
                                    i18 = 1;
                                }
                                jArr4 = jArr6;
                                i14 = i17;
                                if (!jVar.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                t2.b bVar4 = new t2.b(new androidx.compose.ui.d.c[i16], i19);
                                androidx.compose.ui.d.c child = jVar.getNode().getChild();
                                if (child == null) {
                                    b4.k.c(bVar4, jVar.getNode());
                                } else {
                                    bVar4.b(child);
                                }
                                while (bVar4.q()) {
                                    androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar4.v(bVar4.getSize() - 1);
                                    if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                                        b4.k.c(bVar4, cVarG);
                                    } else {
                                        while (cVarG != null) {
                                            if ((cVarG.getKindSet() & iA) != 0) {
                                                t2.b bVar5 = null;
                                                while (cVarG != null) {
                                                    if (cVarG instanceof FocusTargetNode) {
                                                        this.focusTargetNodes.h((FocusTargetNode) cVarG);
                                                    } else {
                                                        if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                                            androidx.compose.ui.d.c delegate2 = ((b4.m) cVarG).getDelegate();
                                                            int i26 = i19;
                                                            while (delegate2 != null) {
                                                                if ((delegate2.getKindSet() & iA) != 0) {
                                                                    i26++;
                                                                    if (i26 == 1) {
                                                                        cVarG = delegate2;
                                                                    } else {
                                                                        if (bVar5 == null) {
                                                                            bVar5 = new t2.b(new androidx.compose.ui.d.c[i16], 0);
                                                                        }
                                                                        if (cVarG != null) {
                                                                            bVar5.b(cVarG);
                                                                            cVarG = null;
                                                                        }
                                                                        bVar5.b(delegate2);
                                                                    }
                                                                }
                                                                delegate2 = delegate2.getChild();
                                                                i16 = 16;
                                                            }
                                                            if (i26 == 1) {
                                                            }
                                                        }
                                                        i19 = 0;
                                                        i16 = 16;
                                                    }
                                                    cVarG = b4.k.g(bVar5);
                                                    i19 = 0;
                                                    i16 = 16;
                                                }
                                                break;
                                            }
                                            cVarG = cVarG.getChild();
                                            i19 = 0;
                                            i16 = 16;
                                        }
                                    }
                                }
                            } else {
                                jArr4 = jArr6;
                                i14 = i17;
                            }
                        } else {
                            jArr4 = jArr6;
                            i14 = i17;
                        }
                        j16 >>= i14;
                        i23++;
                        c12 = c12;
                        i17 = i14;
                        jArr6 = jArr4;
                        i18 = 1;
                        i19 = 0;
                        i16 = 16;
                    }
                    jArr3 = jArr6;
                    c11 = c12;
                    if (i22 != i17) {
                        break;
                    }
                } else {
                    jArr3 = jArr6;
                    c11 = c12;
                }
                if (i21 == length) {
                    break;
                }
                i21++;
                c12 = c11;
                jArr6 = jArr3;
                i18 = 1;
                i19 = 0;
                i16 = 16;
                i17 = 8;
            }
        } else {
            c11 = 7;
            j11 = 255;
            j12 = -9187201950435737472L;
        }
        this.focusPropertiesNodes.m();
        l0<c> l0Var2 = this.focusEventNodes;
        Object[] objArr5 = l0Var2.elements;
        long[] jArr7 = l0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length2 = jArr7.length - 2;
        if (length2 >= 0) {
            int i27 = 0;
            while (true) {
                long j17 = jArr7[i27];
                if ((((~j17) << c11) & j17 & j12) != j12) {
                    int i28 = 8 - ((~(i27 - length2)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j17 & j11) < 128) {
                            c cVar = (c) objArr5[(i27 << 3) + i29];
                            if (cVar.getNode().getIsAttached()) {
                                int iA2 = b1.a(1024);
                                androidx.compose.ui.d.c node2 = cVar.getNode();
                                boolean z11 = false;
                                boolean z12 = true;
                                FocusTargetNode focusTargetNode = null;
                                t2.b bVar6 = null;
                                while (node2 != null) {
                                    long[] jArr8 = jArr7;
                                    if (node2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node2;
                                        if (focusTargetNode != null) {
                                            z11 = true;
                                        }
                                        if (this.focusTargetNodes.a(focusTargetNode2)) {
                                            this.focusTargetsWithInvalidatedFocusEvents.h(focusTargetNode2);
                                            z12 = false;
                                        }
                                        objArr3 = objArr5;
                                        j14 = j17;
                                        focusTargetNode = focusTargetNode2;
                                    } else if ((node2.getKindSet() & iA2) == 0 || !(node2 instanceof b4.m)) {
                                        objArr3 = objArr5;
                                        j14 = j17;
                                    } else {
                                        androidx.compose.ui.d.c delegate3 = ((b4.m) node2).getDelegate();
                                        objArr3 = objArr5;
                                        int i31 = 0;
                                        while (delegate3 != null) {
                                            if ((delegate3.getKindSet() & iA2) != 0) {
                                                i31++;
                                                j15 = j17;
                                                if (i31 == 1) {
                                                    node2 = delegate3;
                                                } else {
                                                    t2.b bVar7 = bVar6 == null ? new t2.b(new androidx.compose.ui.d.c[16], 0) : bVar6;
                                                    if (node2 != null) {
                                                        bVar7.b(node2);
                                                        node2 = null;
                                                    }
                                                    bVar7.b(delegate3);
                                                    bVar6 = bVar7;
                                                    i31 = i31;
                                                }
                                            } else {
                                                j15 = j17;
                                            }
                                            delegate3 = delegate3.getChild();
                                            j17 = j15;
                                        }
                                        j14 = j17;
                                        if (i31 == 1) {
                                        }
                                        jArr7 = jArr8;
                                        objArr5 = objArr3;
                                        j17 = j14;
                                    }
                                    node2 = b4.k.g(bVar6);
                                    jArr7 = jArr8;
                                    objArr5 = objArr3;
                                    j17 = j14;
                                }
                                jArr2 = jArr7;
                                objArr2 = objArr5;
                                j13 = j17;
                                if (!cVar.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                t2.b bVar8 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                androidx.compose.ui.d.c child2 = cVar.getNode().getChild();
                                if (child2 == null) {
                                    b4.k.c(bVar8, cVar.getNode());
                                } else {
                                    bVar8.b(child2);
                                }
                                while (bVar8.q()) {
                                    androidx.compose.ui.d.c cVarG2 = (androidx.compose.ui.d.c) bVar8.v(bVar8.getSize() - 1);
                                    if ((cVarG2.getAggregateChildKindSet() & iA2) == 0) {
                                        b4.k.c(bVar8, cVarG2);
                                    } else {
                                        while (true) {
                                            if (cVarG2 != null) {
                                                if ((cVarG2.getKindSet() & iA2) != 0) {
                                                    t2.b bVar9 = null;
                                                    while (cVarG2 != null) {
                                                        if (cVarG2 instanceof FocusTargetNode) {
                                                            FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarG2;
                                                            if (focusTargetNode != null) {
                                                                z11 = true;
                                                            }
                                                            if (this.focusTargetNodes.a(focusTargetNode3)) {
                                                                this.focusTargetsWithInvalidatedFocusEvents.h(focusTargetNode3);
                                                                z12 = false;
                                                            }
                                                            focusTargetNode = focusTargetNode3;
                                                        } else {
                                                            if ((cVarG2.getKindSet() & iA2) != 0 && (cVarG2 instanceof b4.m)) {
                                                                androidx.compose.ui.d.c delegate4 = ((b4.m) cVarG2).getDelegate();
                                                                int i32 = 0;
                                                                while (delegate4 != null) {
                                                                    if ((delegate4.getKindSet() & iA2) != 0) {
                                                                        i32++;
                                                                        bVar = bVar8;
                                                                        if (i32 == 1) {
                                                                            cVarG2 = delegate4;
                                                                        } else {
                                                                            if (bVar9 == null) {
                                                                                bVar9 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                                                            }
                                                                            if (cVarG2 != null) {
                                                                                bVar9.b(cVarG2);
                                                                                cVarG2 = null;
                                                                            }
                                                                            bVar9.b(delegate4);
                                                                        }
                                                                        delegate4 = delegate4.getChild();
                                                                        bVar8 = bVar;
                                                                        i29 = i29;
                                                                    } else {
                                                                        bVar = bVar8;
                                                                    }
                                                                    i29 = i29;
                                                                    delegate4 = delegate4.getChild();
                                                                    bVar8 = bVar;
                                                                    i29 = i29;
                                                                }
                                                                bVar8 = bVar8;
                                                                i13 = i29;
                                                                if (i32 != 1) {
                                                                    cVarG2 = b4.k.g(bVar9);
                                                                }
                                                            }
                                                            bVar8 = bVar8;
                                                            i29 = i13;
                                                        }
                                                        i13 = i29;
                                                        cVarG2 = b4.k.g(bVar9);
                                                        bVar8 = bVar8;
                                                        i29 = i13;
                                                    }
                                                } else {
                                                    cVarG2 = cVarG2.getChild();
                                                    bVar8 = bVar8;
                                                }
                                            }
                                        }
                                    }
                                    bVar8 = bVar8;
                                    i29 = i29;
                                }
                                i12 = i29;
                                if (z12) {
                                    if (z11) {
                                        oVarE2 = d.a(cVar);
                                    } else if (focusTargetNode == null || (oVarE2 = focusTargetNode.E2()) == null) {
                                        oVarE2 = p.Inactive;
                                    }
                                    cVar.y(oVarE2);
                                }
                            } else {
                                cVar.y(p.Inactive);
                                jArr2 = jArr7;
                                objArr2 = objArr5;
                                j13 = j17;
                                i12 = i29;
                            }
                        } else {
                            jArr2 = jArr7;
                            objArr2 = objArr5;
                            j13 = j17;
                            i12 = i29;
                        }
                        i29 = i12 + 1;
                        j17 = j13 >> 8;
                        jArr7 = jArr2;
                        objArr5 = objArr2;
                    }
                    jArr = jArr7;
                    objArr = objArr5;
                    i11 = 0;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr7;
                    objArr = objArr5;
                    i11 = 0;
                }
                if (i27 == length2) {
                    break;
                }
                i27++;
                jArr7 = jArr;
                objArr5 = objArr;
            }
        } else {
            i11 = 0;
        }
        this.focusEventNodes.m();
        l0<FocusTargetNode> l0Var3 = this.focusTargetNodes;
        Object[] objArr6 = l0Var3.elements;
        long[] jArr9 = l0Var3.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length3 = jArr9.length - 2;
        if (length3 >= 0) {
            int i33 = i11;
            while (true) {
                long j18 = jArr9[i33];
                if ((((~j18) << c11) & j18 & j12) != j12) {
                    int i34 = 8 - ((~(i33 - length3)) >>> 31);
                    for (int i35 = i11; i35 < i34; i35++) {
                        if ((j18 & j11) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr6[(i33 << 3) + i35];
                            if (focusTargetNode4.getIsAttached()) {
                                p pVarE2 = focusTargetNode4.E2();
                                focusTargetNode4.J2();
                                if (pVarE2 != focusTargetNode4.E2() || this.focusTargetsWithInvalidatedFocusEvents.a(focusTargetNode4)) {
                                    d.c(focusTargetNode4);
                                }
                            }
                        }
                        j18 >>= 8;
                    }
                    if (i34 != 8) {
                        break;
                    }
                }
                if (i33 == length3) {
                    break;
                } else {
                    i33++;
                }
            }
        }
        this.focusTargetNodes.m();
        this.focusTargetsWithInvalidatedFocusEvents.m();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodes.d()) {
            y3.a.b("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodes.d()) {
            y3.a.b("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodes.d()) {
            return;
        }
        y3.a.b("Unprocessed FocusTarget nodes");
    }

    private final <T> void d(l0<T> l0Var, T t11) {
        if (l0Var.h(t11) && this.focusTargetNodes.get_size() + this.focusEventNodes.get_size() + this.focusPropertiesNodes.get_size() == 1) {
            this.onRequestApplyChangesListener.invoke(new a(this));
        }
    }

    public final boolean b() {
        return this.focusTargetNodes.e() || this.focusPropertiesNodes.e() || this.focusEventNodes.e();
    }

    public final void e(FocusTargetNode node) {
        d(this.focusTargetNodes, node);
    }

    public final void f(c node) {
        d(this.focusEventNodes, node);
    }

    public final void g(j node) {
        d(this.focusPropertiesNodes, node);
    }
}
