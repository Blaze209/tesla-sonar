package io.sentry.android.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import io.sentry.android.replay.f;
import io.sentry.android.replay.util.p;
import io.sentry.android.replay.util.q;
import io.sentry.q7;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 :2\u00020\u0001:\u0004\u001b\u001f!%Bo\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u001f\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b!\u0010,R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010+\u001a\u0004\b\r\u0010,\"\u0004\b.\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b\u000e\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b%\u00102R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b&\u00108\u0082\u0001\u0003;<=¨\u0006>"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b;", "", "", "x", "y", "", Snapshot.WIDTH, Snapshot.HEIGHT, "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V", "isImportant", "Ljn0/h0;", "g", "(Z)V", "Lkotlin/Function1;", "callback", "h", "(Lwn0/l;)V", "a", Gender.FEMALE, "getX", "()F", "b", "getY", "c", "I", "e", "()I", DateTokenConverter.CONVERTER_KEY, "f", "getDistance", "Lio/sentry/android/replay/viewhierarchy/b;", "getParent", "()Lio/sentry/android/replay/viewhierarchy/b;", "Z", "()Z", IntegerTokenConverter.CONVERTER_KEY, "setImportantForContentCapture", "j", "k", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "", "l", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "(Ljava/util/List;)V", "children", "m", "Lio/sentry/android/replay/viewhierarchy/b$b;", "Lio/sentry/android/replay/viewhierarchy/b$c;", "Lio/sentry/android/replay/viewhierarchy/b$d;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f80228n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int distance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b parent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldMask;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isImportantForContentCapture;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Rect visibleRect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private List<? extends b> children;

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ/\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b$a;", "", "<init>", "()V", "Ljava/lang/Class;", "", "", "set", "", "b", "(Ljava/lang/Class;Ljava/util/Set;)Z", "Landroid/view/View;", "Lio/sentry/q7;", "options", "e", "(Landroid/view/View;Lio/sentry/q7;)Z", "Landroid/view/ViewParent;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/ViewParent;Lio/sentry/q7;)Z", "c", "view", "Lio/sentry/android/replay/viewhierarchy/b;", "parent", "", "distance", "a", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/b;ILio/sentry/q7;)Lio/sentry/android/replay/viewhierarchy/b;", "SENTRY_MASK_TAG", "Ljava/lang/String;", "SENTRY_UNMASK_TAG", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean c(View view, q7 q7Var) {
            String strF = q7Var.getSessionReplay().f();
            if (strF == null) {
                return false;
            }
            return s.f(view.getClass().getName(), strF);
        }

        private final boolean d(ViewParent viewParent, q7 q7Var) {
            String strT = q7Var.getSessionReplay().t();
            if (strT == null) {
                return false;
            }
            return s.f(viewParent.getClass().getName(), strT);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0028  */
        /* JADX WARN: Code duplicated, block: B:16:0x0037  */
        /* JADX WARN: Code duplicated, block: B:18:0x003f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0042  */
        /* JADX WARN: Code duplicated, block: B:21:0x0045  */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0068  */
        /* JADX WARN: Code duplicated, block: B:31:0x006e  */
        /* JADX WARN: Code duplicated, block: B:35:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x009b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x009c  */
        private final boolean e(View view, q7 q7Var) {
            Object tag;
            String str;
            Class<?> cls;
            Set<String> setS;
            ViewParent parent;
            String lowerCase;
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                s.j(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 == null || !t.h0(lowerCase2, "sentry-unmask", false, 2, null)) {
                    if (!s.f(view.getTag(f.f80036a), "unmask")) {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            s.j(lowerCase, "toLowerCase(...)");
                            if (lowerCase != null || !t.h0(lowerCase, "sentry-mask", false, 2, null)) {
                                if (!s.f(view.getTag(f.f80036a), "mask")) {
                                    if (!c(view, q7Var) && view.getParent() != null) {
                                        parent = view.getParent();
                                        s.j(parent, "getParent(...)");
                                        if (d(parent, q7Var)) {
                                            return false;
                                        }
                                    }
                                    cls = view.getClass();
                                    setS = q7Var.getSessionReplay().s();
                                    s.j(setS, "getUnmaskViewClasses(...)");
                                    if (b(cls, setS)) {
                                        return false;
                                    }
                                    Class<?> cls2 = view.getClass();
                                    Set<String> setE = q7Var.getSessionReplay().e();
                                    s.j(setE, "getMaskViewClasses(...)");
                                    return b(cls2, setE);
                                }
                            }
                        } else if (!s.f(view.getTag(f.f80036a), "mask")) {
                            if (!c(view, q7Var)) {
                                parent = view.getParent();
                                s.j(parent, "getParent(...)");
                                if (d(parent, q7Var)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setS = q7Var.getSessionReplay().s();
                            s.j(setS, "getUnmaskViewClasses(...)");
                            if (b(cls, setS)) {
                                return false;
                            }
                            Class<?> cls3 = view.getClass();
                            Set<String> setE2 = q7Var.getSessionReplay().e();
                            s.j(setE2, "getMaskViewClasses(...)");
                            return b(cls3, setE2);
                        }
                        return true;
                    }
                }
            } else if (!s.f(view.getTag(f.f80036a), "unmask")) {
                tag = view.getTag();
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    s.j(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                        if (!s.f(view.getTag(f.f80036a), "mask")) {
                            if (!c(view, q7Var)) {
                                parent = view.getParent();
                                s.j(parent, "getParent(...)");
                                if (d(parent, q7Var)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setS = q7Var.getSessionReplay().s();
                            s.j(setS, "getUnmaskViewClasses(...)");
                            if (b(cls, setS)) {
                                return false;
                            }
                            Class<?> cls4 = view.getClass();
                            Set<String> setE3 = q7Var.getSessionReplay().e();
                            s.j(setE3, "getMaskViewClasses(...)");
                            return b(cls4, setE3);
                        }
                    } else if (!s.f(view.getTag(f.f80036a), "mask")) {
                        if (!c(view, q7Var)) {
                            parent = view.getParent();
                            s.j(parent, "getParent(...)");
                            if (d(parent, q7Var)) {
                                return false;
                            }
                        }
                        cls = view.getClass();
                        setS = q7Var.getSessionReplay().s();
                        s.j(setS, "getUnmaskViewClasses(...)");
                        if (b(cls, setS)) {
                            return false;
                        }
                        Class<?> cls5 = view.getClass();
                        Set<String> setE4 = q7Var.getSessionReplay().e();
                        s.j(setE4, "getMaskViewClasses(...)");
                        return b(cls5, setE4);
                    }
                } else if (!s.f(view.getTag(f.f80036a), "mask")) {
                    if (!c(view, q7Var)) {
                        parent = view.getParent();
                        s.j(parent, "getParent(...)");
                        if (d(parent, q7Var)) {
                            return false;
                        }
                    }
                    cls = view.getClass();
                    setS = q7Var.getSessionReplay().s();
                    s.j(setS, "getUnmaskViewClasses(...)");
                    if (b(cls, setS)) {
                        return false;
                    }
                    Class<?> cls6 = view.getClass();
                    Set<String> setE5 = q7Var.getSessionReplay().e();
                    s.j(setE5, "getMaskViewClasses(...)");
                    return b(cls6, setE5);
                }
                return true;
            }
            return false;
        }

        public final b a(View view, b parent, int distance, q7 options) {
            Drawable drawable;
            s.k(view, "view");
            s.k(options, "options");
            Pair<Boolean, Rect> pairG = q.g(view);
            boolean zBooleanValue = pairG.a().booleanValue();
            Rect rectB = pairG.b();
            boolean z11 = zBooleanValue && e(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new C1696b(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + view.getElevation(), distance, parent, z11, false, zBooleanValue, rectB);
                }
                if (parent != null) {
                    parent.g(true);
                }
                ImageView imageView = (ImageView) view;
                return new c(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + imageView.getElevation(), distance, parent, z11 && (drawable = imageView.getDrawable()) != null && q.f(drawable), true, zBooleanValue, rectB);
            }
            if (parent != null) {
                parent.g(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
            int iJ = q.j(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int iC = q.c(textView);
            float x11 = textView.getX();
            float y11 = textView.getY();
            int width = textView.getWidth();
            float elevation = 0.0f;
            int height = textView.getHeight();
            if (parent != null) {
                elevation = parent.getElevation();
            }
            return new d(aVar, Integer.valueOf(iJ), totalPaddingLeft, iC, x11, y11, width, height, elevation + textView.getElevation(), distance, parent, z11, true, zBooleanValue, rectB);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b$b;", "Lio/sentry/android/replay/viewhierarchy/b;", "", "x", "y", "", Snapshot.WIDTH, Snapshot.HEIGHT, "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1696b extends b {
        public C1696b(float f11, float f12, int i11, int i12, float f13, int i13, b bVar, boolean z11, boolean z12, boolean z13, Rect rect) {
            super(f11, f12, i11, i12, f13, i13, bVar, z11, z12, z13, rect, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b$c;", "Lio/sentry/android/replay/viewhierarchy/b;", "", "x", "y", "", Snapshot.WIDTH, Snapshot.HEIGHT, "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends b {
        public c(float f11, float f12, int i11, int i12, float f13, int i13, b bVar, boolean z11, boolean z12, boolean z13, Rect rect) {
            super(f11, f12, i11, i12, f13, i13, bVar, z11, z12, z13, rect, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b$d;", "Lio/sentry/android/replay/viewhierarchy/b;", "Lio/sentry/android/replay/util/p;", "layout", "", "dominantColor", "paddingLeft", "paddingTop", "", "x", "y", Snapshot.WIDTH, Snapshot.HEIGHT, "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(Lio/sentry/android/replay/util/p;Ljava/lang/Integer;IIFFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V", "o", "Lio/sentry/android/replay/util/p;", "j", "()Lio/sentry/android/replay/util/p;", "p", "Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "q", "I", "k", "()I", "r", "l", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends b {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final p layout;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final Integer dominantColor;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final int paddingLeft;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final int paddingTop;

        public /* synthetic */ d(p pVar, Integer num, int i11, int i12, float f11, float f12, int i13, int i14, float f13, int i15, b bVar, boolean z11, boolean z12, boolean z13, Rect rect, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? null : pVar, (i16 & 2) != 0 ? null : num, (i16 & 4) != 0 ? 0 : i11, (i16 & 8) != 0 ? 0 : i12, f11, f12, i13, i14, f13, i15, (i16 & 1024) != 0 ? null : bVar, (i16 & 2048) != 0 ? false : z11, (i16 & 4096) != 0 ? false : z12, (i16 & PKIFailureInfo.certRevoked) != 0 ? false : z13, (i16 & 16384) != 0 ? null : rect);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final p getLayout() {
            return this.layout;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public d(p pVar, Integer num, int i11, int i12, float f11, float f12, int i13, int i14, float f13, int i15, b bVar, boolean z11, boolean z12, boolean z13, Rect rect) {
            super(f11, f12, i13, i14, f13, i15, bVar, z11, z12, z13, rect, null);
            this.layout = pVar;
            this.dominantColor = num;
            this.paddingLeft = i11;
            this.paddingTop = i12;
        }
    }

    public /* synthetic */ b(float f11, float f12, int i11, int i12, float f13, int i13, b bVar, boolean z11, boolean z12, boolean z13, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, i11, i12, f13, i13, bVar, z11, z12, z13, rect);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public final void f(List<? extends b> list) {
        this.children = list;
    }

    public final void g(boolean isImportant) {
        for (b bVar = this.parent; bVar != null; bVar = bVar.parent) {
            bVar.isImportantForContentCapture = isImportant;
        }
    }

    public final void h(l<? super b, Boolean> callback) {
        List<? extends b> list;
        s.k(callback, "callback");
        if (!callback.invoke(this).booleanValue() || (list = this.children) == null) {
            return;
        }
        s.h(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).h(callback);
        }
    }

    private b(float f11, float f12, int i11, int i12, float f13, int i13, b bVar, boolean z11, boolean z12, boolean z13, Rect rect) {
        this.x = f11;
        this.y = f12;
        this.width = i11;
        this.height = i12;
        this.elevation = f13;
        this.distance = i13;
        this.parent = bVar;
        this.shouldMask = z11;
        this.isImportantForContentCapture = z12;
        this.isVisible = z13;
        this.visibleRect = rect;
    }
}
