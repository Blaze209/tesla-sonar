package kotlin;

import android.view.KeyEvent;
import p013kotlin.jvm.internal.f0;
import t3.d;
import wn0.l;

/* JADX INFO: renamed from: b2.v, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lt3/b;", "", "shortcutModifier", "Lb2/u;", "a", "(Lwn0/l;)Lb2/u;", "Lb2/u;", "b", "()Lb2/u;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u f15903a = new c(a(new f0() { // from class: b2.v.b
        @Override // p013kotlin.jvm.internal.f0, co0.o
        public Object get(Object obj) {
            return Boolean.valueOf(d.e(((t3.b) obj).getNativeKeyEvent()));
        }
    }));

    /* JADX INFO: renamed from: b2.v$a */
    @p013kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"b2/v$a", "Lb2/u;", "Lt3/b;", "event", "Lb2/s;", "a", "(Landroid/view/KeyEvent;)Lb2/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<t3.b, Boolean> f15904a;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super t3.b, Boolean> lVar) {
            this.f15904a = lVar;
        }

        @Override // kotlin.u
        public s a(KeyEvent event) {
            if (this.f15904a.invoke(t3.b.a(event)).booleanValue() && d.f(event)) {
                if (t3.a.q(d.a(event), f0.f15533a.x())) {
                    return s.REDO;
                }
                return null;
            }
            if (this.f15904a.invoke(t3.b.a(event)).booleanValue()) {
                long jA = d.a(event);
                f0 f0Var = f0.f15533a;
                if (t3.a.q(jA, f0Var.d()) ? true : t3.a.q(jA, f0Var.n())) {
                    return s.COPY;
                }
                if (t3.a.q(jA, f0Var.u())) {
                    return s.PASTE;
                }
                if (t3.a.q(jA, f0Var.v())) {
                    return s.CUT;
                }
                if (t3.a.q(jA, f0Var.a())) {
                    return s.SELECT_ALL;
                }
                if (t3.a.q(jA, f0Var.w())) {
                    return s.REDO;
                }
                if (t3.a.q(jA, f0Var.x())) {
                    return s.UNDO;
                }
                return null;
            }
            if (d.e(event)) {
                return null;
            }
            if (d.f(event)) {
                long jA2 = d.a(event);
                f0 f0Var2 = f0.f15533a;
                if (t3.a.q(jA2, f0Var2.i())) {
                    return s.SELECT_LEFT_CHAR;
                }
                if (t3.a.q(jA2, f0Var2.j())) {
                    return s.SELECT_RIGHT_CHAR;
                }
                if (t3.a.q(jA2, f0Var2.k())) {
                    return s.SELECT_UP;
                }
                if (t3.a.q(jA2, f0Var2.h())) {
                    return s.SELECT_DOWN;
                }
                if (t3.a.q(jA2, f0Var2.r())) {
                    return s.SELECT_PAGE_UP;
                }
                if (t3.a.q(jA2, f0Var2.q())) {
                    return s.SELECT_PAGE_DOWN;
                }
                if (t3.a.q(jA2, f0Var2.p())) {
                    return s.SELECT_LINE_START;
                }
                if (t3.a.q(jA2, f0Var2.o())) {
                    return s.SELECT_LINE_END;
                }
                if (t3.a.q(jA2, f0Var2.n())) {
                    return s.PASTE;
                }
                return null;
            }
            long jA3 = d.a(event);
            f0 f0Var3 = f0.f15533a;
            if (t3.a.q(jA3, f0Var3.i())) {
                return s.LEFT_CHAR;
            }
            if (t3.a.q(jA3, f0Var3.j())) {
                return s.RIGHT_CHAR;
            }
            if (t3.a.q(jA3, f0Var3.k())) {
                return s.UP;
            }
            if (t3.a.q(jA3, f0Var3.h())) {
                return s.DOWN;
            }
            if (t3.a.q(jA3, f0Var3.r())) {
                return s.PAGE_UP;
            }
            if (t3.a.q(jA3, f0Var3.q())) {
                return s.PAGE_DOWN;
            }
            if (t3.a.q(jA3, f0Var3.p())) {
                return s.LINE_START;
            }
            if (t3.a.q(jA3, f0Var3.o())) {
                return s.LINE_END;
            }
            if (t3.a.q(jA3, f0Var3.l())) {
                return s.NEW_LINE;
            }
            if (t3.a.q(jA3, f0Var3.c())) {
                return s.DELETE_PREV_CHAR;
            }
            if (t3.a.q(jA3, f0Var3.g())) {
                return s.DELETE_NEXT_CHAR;
            }
            if (t3.a.q(jA3, f0Var3.s())) {
                return s.PASTE;
            }
            if (t3.a.q(jA3, f0Var3.f())) {
                return s.CUT;
            }
            if (t3.a.q(jA3, f0Var3.e())) {
                return s.COPY;
            }
            if (t3.a.q(jA3, f0Var3.t())) {
                return s.TAB;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b2.v$c */
    @p013kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"b2/v$c", "Lb2/u;", "Lt3/b;", "event", "Lb2/s;", "a", "(Landroid/view/KeyEvent;)Lb2/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f15906a;

        c(u uVar) {
            this.f15906a = uVar;
        }

        @Override // kotlin.u
        public s a(KeyEvent event) {
            s sVar = null;
            if (d.f(event) && d.e(event)) {
                long jA = d.a(event);
                f0 f0Var = f0.f15533a;
                if (t3.a.q(jA, f0Var.i())) {
                    sVar = s.SELECT_LEFT_WORD;
                } else if (t3.a.q(jA, f0Var.j())) {
                    sVar = s.SELECT_RIGHT_WORD;
                } else if (t3.a.q(jA, f0Var.k())) {
                    sVar = s.SELECT_PREV_PARAGRAPH;
                } else if (t3.a.q(jA, f0Var.h())) {
                    sVar = s.SELECT_NEXT_PARAGRAPH;
                }
            } else if (d.e(event)) {
                long jA2 = d.a(event);
                f0 f0Var2 = f0.f15533a;
                if (t3.a.q(jA2, f0Var2.i())) {
                    sVar = s.LEFT_WORD;
                } else if (t3.a.q(jA2, f0Var2.j())) {
                    sVar = s.RIGHT_WORD;
                } else if (t3.a.q(jA2, f0Var2.k())) {
                    sVar = s.PREV_PARAGRAPH;
                } else if (t3.a.q(jA2, f0Var2.h())) {
                    sVar = s.NEXT_PARAGRAPH;
                } else if (t3.a.q(jA2, f0Var2.m())) {
                    sVar = s.DELETE_PREV_CHAR;
                } else if (t3.a.q(jA2, f0Var2.g())) {
                    sVar = s.DELETE_NEXT_WORD;
                } else if (t3.a.q(jA2, f0Var2.c())) {
                    sVar = s.DELETE_PREV_WORD;
                } else if (t3.a.q(jA2, f0Var2.b())) {
                    sVar = s.DESELECT;
                }
            } else if (d.f(event)) {
                long jA3 = d.a(event);
                f0 f0Var3 = f0.f15533a;
                if (t3.a.q(jA3, f0Var3.p())) {
                    sVar = s.SELECT_LINE_LEFT;
                } else if (t3.a.q(jA3, f0Var3.o())) {
                    sVar = s.SELECT_LINE_RIGHT;
                }
            } else if (d.d(event)) {
                long jA4 = d.a(event);
                f0 f0Var4 = f0.f15533a;
                if (t3.a.q(jA4, f0Var4.c())) {
                    sVar = s.DELETE_FROM_LINE_START;
                } else if (t3.a.q(jA4, f0Var4.g())) {
                    sVar = s.DELETE_TO_LINE_END;
                }
            }
            return sVar == null ? this.f15906a.a(event) : sVar;
        }
    }

    public static final u a(l<? super t3.b, Boolean> lVar) {
        return new a(lVar);
    }

    public static final u b() {
        return f15903a;
    }
}
