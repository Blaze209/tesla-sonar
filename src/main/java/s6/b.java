package s6;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class b {

    public interface a<T> {
        void a(T t11, Rect rect);
    }

    /* JADX INFO: renamed from: s6.b$b, reason: collision with other inner class name */
    public interface InterfaceC2349b<T, V> {
        V a(T t11, int i11);

        int b(T t11);
    }

    private static class c<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f110349a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f110350b = new Rect();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f110351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a<T> f110352d;

        c(boolean z11, a<T> aVar) {
            this.f110351c = z11;
            this.f110352d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t11, T t12) {
            Rect rect = this.f110349a;
            Rect rect2 = this.f110350b;
            this.f110352d.a(t11, rect);
            this.f110352d.a(t12, rect2);
            int i11 = rect.top;
            int i12 = rect2.top;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            int i13 = rect.left;
            int i14 = rect2.left;
            if (i13 < i14) {
                return this.f110351c ? 1 : -1;
            }
            if (i13 > i14) {
                return this.f110351c ? -1 : 1;
            }
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if (i15 < i16) {
                return -1;
            }
            if (i15 > i16) {
                return 1;
            }
            int i17 = rect.right;
            int i18 = rect2.right;
            if (i17 < i18) {
                return this.f110351c ? 1 : -1;
            }
            if (i17 > i18) {
                return this.f110351c ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i11, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean zB = b(i11, rect, rect2);
        if (b(i11, rect, rect3) || !zB) {
            return false;
        }
        return !j(i11, rect, rect3) || i11 == 17 || i11 == 66 || k(i11, rect, rect2) < m(i11, rect, rect3);
    }

    private static boolean b(int i11, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(@NonNull L l11, @NonNull InterfaceC2349b<L, T> interfaceC2349b, @NonNull a<T> aVar, T t11, @NonNull Rect rect, int i11) {
        Rect rect2 = new Rect(rect);
        if (i11 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i11 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i11 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i11 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iB = interfaceC2349b.b(l11);
        Rect rect3 = new Rect();
        T t12 = null;
        for (int i12 = 0; i12 < iB; i12++) {
            T tA = interfaceC2349b.a(l11, i12);
            if (tA != t11) {
                aVar.a(tA, rect3);
                if (h(i11, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t12 = tA;
                }
            }
        }
        return t12;
    }

    public static <L, T> T d(@NonNull L l11, @NonNull InterfaceC2349b<L, T> interfaceC2349b, @NonNull a<T> aVar, T t11, int i11, boolean z11, boolean z12) {
        int iB = interfaceC2349b.b(l11);
        ArrayList arrayList = new ArrayList(iB);
        for (int i12 = 0; i12 < iB; i12++) {
            arrayList.add(interfaceC2349b.a(l11, i12));
        }
        Collections.sort(arrayList, new c(z11, aVar));
        if (i11 == 1) {
            return (T) f(t11, arrayList, z12);
        }
        if (i11 == 2) {
            return (T) e(t11, arrayList, z12);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t11, ArrayList<T> arrayList, boolean z11) {
        int size = arrayList.size();
        int iLastIndexOf = (t11 == null ? -1 : arrayList.lastIndexOf(t11)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z11 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t11, ArrayList<T> arrayList, boolean z11) {
        int size = arrayList.size();
        int iIndexOf = (t11 == null ? size : arrayList.indexOf(t11)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z11 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i11, int i12) {
        return (i11 * 13 * i11) + (i12 * i12);
    }

    private static boolean h(int i11, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!i(rect, rect2, i11)) {
            return false;
        }
        if (i(rect, rect3, i11) && !a(i11, rect, rect2, rect3)) {
            return !a(i11, rect, rect3, rect2) && g(k(i11, rect, rect2), o(i11, rect, rect2)) < g(k(i11, rect, rect3), o(i11, rect, rect3));
        }
        return true;
    }

    private static boolean i(@NonNull Rect rect, @NonNull Rect rect2, int i11) {
        if (i11 == 17) {
            int i12 = rect.right;
            int i13 = rect2.right;
            return (i12 > i13 || rect.left >= i13) && rect.left > rect2.left;
        }
        if (i11 == 33) {
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            return (i14 > i15 || rect.top >= i15) && rect.top > rect2.top;
        }
        if (i11 == 66) {
            int i16 = rect.left;
            int i17 = rect2.left;
            return (i16 < i17 || rect.right <= i17) && rect.right < rect2.right;
        }
        if (i11 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        return (i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i11, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i11 == 17) {
            return rect.left >= rect2.right;
        }
        if (i11 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i11 == 66) {
            return rect.right <= rect2.left;
        }
        if (i11 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i11, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, l(i11, rect, rect2));
    }

    private static int l(int i11, @NonNull Rect rect, @NonNull Rect rect2) {
        int i12;
        int i13;
        if (i11 == 17) {
            i12 = rect.left;
            i13 = rect2.right;
        } else if (i11 == 33) {
            i12 = rect.top;
            i13 = rect2.bottom;
        } else if (i11 == 66) {
            i12 = rect2.left;
            i13 = rect.right;
        } else {
            if (i11 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i12 = rect2.top;
            i13 = rect.bottom;
        }
        return i12 - i13;
    }

    private static int m(int i11, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, n(i11, rect, rect2));
    }

    private static int n(int i11, @NonNull Rect rect, @NonNull Rect rect2) {
        int i12;
        int i13;
        if (i11 == 17) {
            i12 = rect.left;
            i13 = rect2.left;
        } else if (i11 == 33) {
            i12 = rect.top;
            i13 = rect2.top;
        } else if (i11 == 66) {
            i12 = rect2.right;
            i13 = rect.right;
        } else {
            if (i11 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i12 = rect2.bottom;
            i13 = rect.bottom;
        }
        return i12 - i13;
    }

    private static int o(int i11, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
