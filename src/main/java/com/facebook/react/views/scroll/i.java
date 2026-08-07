package com.facebook.react.views.scroll;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.w;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/scroll/i;", "", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0014\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/views/scroll/i$a;", "", "<init>", "()V", "T", "Lcom/facebook/react/views/scroll/i$b;", "viewManager", "scrollView", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/views/scroll/i$b;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V", "e", "", "", "", "a", "()Ljava/util/Map;", "commandType", "b", "(Lcom/facebook/react/views/scroll/i$b;Ljava/lang/Object;ILcom/facebook/react/bridge/ReadableArray;)V", "c", "(Lcom/facebook/react/views/scroll/i$b;Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "COMMAND_SCROLL_TO", "I", "COMMAND_SCROLL_TO_END", "COMMAND_FLASH_SCROLL_INDICATORS", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <T> void d(b<T> viewManager, T scrollView, ReadableArray args) {
            viewManager.scrollTo(scrollView, new c(Math.round(w.g(args.getDouble(0))), Math.round(w.g(args.getDouble(1))), args.getBoolean(2)));
        }

        private final <T> void e(b<T> viewManager, T scrollView, ReadableArray args) {
            viewManager.scrollToEnd(scrollView, new d(args.getBoolean(0)));
        }

        public final Map<String, Integer> a() {
            return v0.k(x.a("scrollTo", 1), x.a("scrollToEnd", 2), x.a("flashScrollIndicators", 3));
        }

        public final <T> void b(b<T> viewManager, T scrollView, int commandType, ReadableArray args) {
            s.k(viewManager, "viewManager");
            if (scrollView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (commandType == 1) {
                if (args == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d(viewManager, scrollView, args);
                return;
            }
            if (commandType == 2) {
                if (args == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                e(viewManager, scrollView, args);
            } else {
                if (commandType == 3) {
                    viewManager.flashScrollIndicators(scrollView);
                    return;
                }
                throw new IllegalArgumentException("Unsupported command " + commandType + " received by " + viewManager.getClass().getSimpleName() + ".");
            }
        }

        public final <T> void c(b<T> viewManager, T scrollView, String commandType, ReadableArray args) {
            s.k(viewManager, "viewManager");
            s.k(commandType, "commandType");
            if (scrollView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iHashCode = commandType.hashCode();
            if (iHashCode != -402165208) {
                if (iHashCode != 28425985) {
                    if (iHashCode == 2055114131 && commandType.equals("scrollToEnd")) {
                        if (args == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        e(viewManager, scrollView, args);
                        return;
                    }
                } else if (commandType.equals("flashScrollIndicators")) {
                    viewManager.flashScrollIndicators(scrollView);
                    return;
                }
            } else if (commandType.equals("scrollTo")) {
                if (args == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d(viewManager, scrollView, args);
                return;
            }
            throw new IllegalArgumentException("Unsupported command " + commandType + " received by " + viewManager.getClass().getSimpleName() + ".");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/i$b;", "T", "", "scrollView", "Lcom/facebook/react/views/scroll/i$c;", "data", "Ljn0/h0;", "scrollTo", "(Ljava/lang/Object;Lcom/facebook/react/views/scroll/i$c;)V", "Lcom/facebook/react/views/scroll/i$d;", "scrollToEnd", "(Ljava/lang/Object;Lcom/facebook/react/views/scroll/i$d;)V", "flashScrollIndicators", "(Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b<T> {
        void flashScrollIndicators(T scrollView);

        void scrollTo(T scrollView, c data);

        void scrollToEnd(T scrollView, d data);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/scroll/i$c;", "", "", "mDestX", "mDestY", "", "mAnimated", "<init>", "(IIZ)V", "a", "I", "b", "c", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int mDestX;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int mDestY;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean mAnimated;

        public c(int i11, int i12, boolean z11) {
            this.mDestX = i11;
            this.mDestY = i12;
            this.mAnimated = z11;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/scroll/i$d;", "", "", "mAnimated", "<init>", "(Z)V", "a", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean mAnimated;

        public d(boolean z11) {
            this.mAnimated = z11;
        }
    }

    public static final Map<String, Integer> a() {
        return INSTANCE.a();
    }

    public static final <T> void b(b<T> bVar, T t11, int i11, ReadableArray readableArray) {
        INSTANCE.b(bVar, t11, i11, readableArray);
    }

    public static final <T> void c(b<T> bVar, T t11, String str, ReadableArray readableArray) {
        INSTANCE.c(bVar, t11, str, readableArray);
    }
}
