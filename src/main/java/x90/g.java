package x90;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.s0;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import ho0.l;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lx90/g;", "", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x90.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lx90/g$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lcom/horcrux/svg/SvgView;", "b", "(Landroid/view/View;)Lcom/horcrux/svg/SvgView;", "", "e", "(Ljava/lang/Object;)Z", "", "posX", "posY", "c", "(Landroid/view/View;FF)Z", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SvgView b(View view) {
            SvgView svgView;
            if (view instanceof VirtualView) {
                svgView = ((VirtualView) view).getSvgView();
                s.h(svgView);
            } else {
                s.i(view, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                svgView = (SvgView) view;
            }
            while (true) {
                ViewParent parent = svgView.getParent();
                s.j(parent, "getParent(...)");
                if (!e(parent)) {
                    return svgView;
                }
                if (svgView.getParent() instanceof VirtualView) {
                    ViewParent parent2 = svgView.getParent();
                    s.i(parent2, "null cannot be cast to non-null type com.horcrux.svg.VirtualView");
                    svgView = ((VirtualView) parent2).getSvgView();
                    s.h(svgView);
                } else {
                    ViewParent parent3 = svgView.getParent();
                    s.i(parent3, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                    svgView = (SvgView) parent3;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(View it) {
            s.k(it, "it");
            return it.getId();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0056  */
        public final boolean c(View view, float posX, float posY) {
            boolean z11;
            s.k(view, "view");
            SvgView svgViewB = b(view);
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            view.getLocationOnScreen(iArr);
            svgViewB.getLocationOnScreen(iArr2);
            int iReactTagForTouch = svgViewB.reactTagForTouch((iArr[0] + posX) - iArr2[0], (iArr[1] + posY) - iArr2[1]);
            boolean z12 = view.getId() == iReactTagForTouch;
            double width = view.getWidth();
            double d11 = posX;
            if (0.0d > d11 || d11 > width) {
                z11 = false;
            } else {
                double height = view.getHeight();
                double d12 = posY;
                if (0.0d > d12 || d12 > height) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            if (view instanceof SvgView) {
                return (z12 || l.A(l.U(s0.a((ViewGroup) view), new wn0.l() { // from class: x90.f
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(g.Companion.d((View) obj));
                    }
                }), Integer.valueOf(iReactTagForTouch))) && z11;
            }
            return z12 && z11;
        }

        public final boolean e(Object view) {
            s.k(view, "view");
            return (view instanceof VirtualView) || (view instanceof SvgView);
        }

        private Companion() {
        }
    }
}
