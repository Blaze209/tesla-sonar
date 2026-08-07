package j00;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ScrollView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.w;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 12\u00020\u0001:\u0002HEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\"J%\u0010&\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H\u0016¢\u0006\u0004\b&\u0010'J5\u0010)\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H\u0016¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J/\u0010-\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010,J-\u0010/\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H\u0016¢\u0006\u0004\b/\u00100J5\u00101\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010:\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b=\u0010;J%\u0010@\u001a\u00020\u00062\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010>H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bB\u0010;J\u0019\u0010C\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bC\u0010;J\u000f\u0010D\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010\u0003R\u0016\u0010F\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00107R\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00107R\u0016\u0010O\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010BR\u0016\u0010Q\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010BR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010@R\u0016\u0010Z\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010^\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010YR\u0016\u0010`\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010YR$\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010BR\u0016\u0010g\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010BR\u0018\u0010h\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010T¨\u0006i"}, d2 = {"Lj00/c;", "", "<init>", "()V", "", "offset", "Ljn0/h0;", "w", "(I)V", "Landroid/view/View;", "rootView", "", "animatedOffset", "x", "(Landroid/view/View;F)V", "softInputHeight", "Landroid/widget/ScrollView;", "scrollView", "currentFocusedView", "t", "(ILandroid/widget/ScrollView;Landroid/view/View;)I", "y", "(Landroid/widget/ScrollView;F)V", "", "isShowAnimation", "animationStart", "animationEnd", "Lj00/c$b;", "onAnimatorEventListener", "B", "(ZFFLj00/c$b;)V", "from", "to", "r", "(IILandroid/view/View;)V", "u", "Lkotlin/Function0;", "onOffsetAnimationEnd", "z", "(Landroid/view/View;Lwn0/a;)V", "focusedView", "o", "(ILandroid/view/View;Landroid/view/View;Lwn0/a;)V", "s", "(IILandroid/widget/ScrollView;Landroid/view/View;)V", "v", "initialScrollValue", "A", "(Landroid/widget/ScrollView;ILwn0/a;)V", "p", "(ILandroid/widget/ScrollView;Landroid/view/View;Lwn0/a;)V", "E", "(F)V", "", "easing", Gender.FEMALE, "(Ljava/lang/String;)V", "delay", "G", "(Ljava/lang/Integer;)V", "duration", "H", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "I", "(Lwn0/l;)V", "J", "K", "q", "a", "avoidOffset", "Lj00/d;", "b", "Lj00/d;", "animationInterpolator", "c", "bottomOffset", "", DateTokenConverter.CONVERTER_KEY, "hideAnimationDelay", "e", "hideAnimationDuration", "Landroid/animation/ValueAnimator;", "f", "Landroid/animation/ValueAnimator;", "hideValueAnimator", "g", "initialScrollViewBottomPadding", "h", "Z", "isHideAnimationCancelled", IntegerTokenConverter.CONVERTER_KEY, "isHideAnimationRunning", "j", "isShowAnimationCancelled", "k", "isShowAnimationRunning", "l", "Lwn0/l;", "onOffsetChangedListener", "m", "showAnimationDelay", "n", "showAnimationDuration", "showValueAnimator", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float avoidOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float bottomOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long hideAnimationDelay;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator hideValueAnimator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int initialScrollViewBottomPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isHideAnimationCancelled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isHideAnimationRunning;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isShowAnimationCancelled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isShowAnimationRunning;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private l<? super Integer, h0> onOffsetChangedListener;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long showAnimationDelay;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator showValueAnimator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private j00.d animationInterpolator = new j00.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long hideAnimationDuration = 220;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long showAnimationDuration = 660;

    /* JADX INFO: renamed from: j00.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"j00/c$c", "Lj00/c$b;", "Ljn0/h0;", "b", "()V", "c", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1717c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f82357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f82358c;

        C1717c(wn0.a<h0> aVar, View view) {
            this.f82357b = aVar;
            this.f82358c = view;
        }

        @Override // j00.c.b
        public void a(float animatedValue) {
            c.this.x(this.f82358c, animatedValue);
        }

        @Override // j00.c.b
        public void b() {
            c.this.w(com.p005reactnativeavoidsoftinput.View.c(0));
        }

        @Override // j00.c.b
        public void c() {
            c cVar = c.this;
            cVar.w(com.p005reactnativeavoidsoftinput.View.c((int) cVar.bottomOffset));
            this.f82357b.invoke();
        }

        @Override // j00.c.b
        public void onCancel() {
            b.a.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"j00/c$d", "Lj00/c$b;", "Ljn0/h0;", "b", "()V", "c", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ScrollView f82360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f82361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f82362d;

        d(ScrollView scrollView, wn0.a<h0> aVar, int i11) {
            this.f82360b = scrollView;
            this.f82361c = aVar;
            this.f82362d = i11;
        }

        @Override // j00.c.b
        public void a(float animatedValue) {
            c.this.y(this.f82360b, animatedValue);
        }

        @Override // j00.c.b
        public void b() {
            c.this.w(com.p005reactnativeavoidsoftinput.View.c(0));
            c.this.initialScrollViewBottomPadding = this.f82360b.getPaddingBottom();
        }

        @Override // j00.c.b
        public void c() {
            c cVar = c.this;
            cVar.w(com.p005reactnativeavoidsoftinput.View.c((int) cVar.bottomOffset));
            this.f82361c.invoke();
            ScrollView scrollView = this.f82360b;
            scrollView.smoothScrollTo(0, scrollView.getScrollY() + this.f82362d);
        }

        @Override // j00.c.b
        public void onCancel() {
            b.a.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"j00/c$e", "Lj00/c$b;", "Ljn0/h0;", "c", "()V", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f82364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f82365c;

        e(float f11, View view) {
            this.f82364b = f11;
            this.f82365c = view;
        }

        @Override // j00.c.b
        public void a(float animatedValue) {
            c.this.x(this.f82365c, animatedValue);
        }

        @Override // j00.c.b
        public void b() {
            b.a.a(this);
        }

        @Override // j00.c.b
        public void c() {
            c.this.w(com.p005reactnativeavoidsoftinput.View.c((int) this.f82364b));
            c.this.bottomOffset = this.f82364b;
        }

        @Override // j00.c.b
        public void onCancel() {
            b.a.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"j00/c$f", "Lj00/c$b;", "Ljn0/h0;", "c", "()V", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f82367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScrollView f82368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f82369d;

        f(float f11, ScrollView scrollView, int i11) {
            this.f82367b = f11;
            this.f82368c = scrollView;
            this.f82369d = i11;
        }

        @Override // j00.c.b
        public void a(float animatedValue) {
            c.this.y(this.f82368c, animatedValue);
        }

        @Override // j00.c.b
        public void b() {
            b.a.a(this);
        }

        @Override // j00.c.b
        public void c() {
            c.this.w(com.p005reactnativeavoidsoftinput.View.c((int) this.f82367b));
            ScrollView scrollView = this.f82368c;
            scrollView.smoothScrollTo(0, scrollView.getScrollY() + this.f82369d);
            c.this.bottomOffset = this.f82367b;
        }

        @Override // j00.c.b
        public void onCancel() {
            b.a.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"j00/c$g", "Lj00/c$b;", "Ljn0/h0;", "c", "()V", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f82371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f82372c;

        g(float f11, View view) {
            this.f82371b = f11;
            this.f82372c = view;
        }

        @Override // j00.c.b
        public void a(float animatedValue) {
            c.this.x(this.f82372c, animatedValue);
        }

        @Override // j00.c.b
        public void b() {
            b.a.a(this);
        }

        @Override // j00.c.b
        public void c() {
            c.this.w(com.p005reactnativeavoidsoftinput.View.c((int) this.f82371b));
            c.this.bottomOffset = this.f82371b;
        }

        @Override // j00.c.b
        public void onCancel() {
            b.a.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"j00/c$h", "Lj00/c$b;", "Ljn0/h0;", "c", "()V", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f82374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScrollView f82375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f82376d;

        h(float f11, ScrollView scrollView, int i11) {
            this.f82374b = f11;
            this.f82375c = scrollView;
            this.f82376d = i11;
        }

        @Override // j00.c.b
        public void a(float animatedValue) {
            c.this.y(this.f82375c, animatedValue);
        }

        @Override // j00.c.b
        public void b() {
            b.a.a(this);
        }

        @Override // j00.c.b
        public void c() {
            c.this.w(com.p005reactnativeavoidsoftinput.View.c((int) this.f82374b));
            ScrollView scrollView = this.f82375c;
            scrollView.smoothScrollTo(0, scrollView.getScrollY() + this.f82376d);
            c.this.bottomOffset = this.f82374b;
        }

        @Override // j00.c.b
        public void onCancel() {
            b.a.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"j00/c$i", "Lj00/c$b;", "Ljn0/h0;", "b", "()V", "c", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f82378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f82379c;

        i(wn0.a<h0> aVar, View view) {
            this.f82378b = aVar;
            this.f82379c = view;
        }

        @Override // j00.c.b
        public void a(float animatedValue) {
            c.this.x(this.f82379c, animatedValue);
        }

        @Override // j00.c.b
        public void b() {
            c cVar = c.this;
            cVar.w(com.p005reactnativeavoidsoftinput.View.c((int) cVar.bottomOffset));
        }

        @Override // j00.c.b
        public void c() {
            c.this.w(0);
            c.this.bottomOffset = BitmapDescriptorFactory.HUE_RED;
            this.f82378b.invoke();
        }

        @Override // j00.c.b
        public void onCancel() {
            b.a.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"j00/c$j", "Lj00/c$b;", "Ljn0/h0;", "b", "()V", "onCancel", "c", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ScrollView f82381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f82382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f82383d;

        j(ScrollView scrollView, int i11, wn0.a<h0> aVar) {
            this.f82381b = scrollView;
            this.f82382c = i11;
            this.f82383d = aVar;
        }

        @Override // j00.c.b
        public void a(float animatedValue) {
            c.this.y(this.f82381b, animatedValue);
        }

        @Override // j00.c.b
        public void b() {
            c cVar = c.this;
            cVar.w(com.p005reactnativeavoidsoftinput.View.c((int) cVar.bottomOffset));
        }

        @Override // j00.c.b
        public void c() {
            c.this.w(0);
            c.this.initialScrollViewBottomPadding = 0;
            c.this.bottomOffset = BitmapDescriptorFactory.HUE_RED;
            this.f82381b.smoothScrollTo(0, this.f82382c);
            this.f82383d.invoke();
        }

        @Override // j00.c.b
        public void onCancel() {
            c.this.y(this.f82381b, BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"j00/c$k", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Ljn0/h0;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f82384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f82385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f82386c;

        k(boolean z11, c cVar, b bVar) {
            this.f82384a = z11;
            this.f82385b = cVar;
            this.f82386c = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            s.k(animation, "animation");
            super.onAnimationEnd(animation);
            if (this.f82384a) {
                this.f82385b.isShowAnimationRunning = false;
                this.f82385b.showValueAnimator = null;
                if (this.f82385b.isShowAnimationCancelled) {
                    this.f82386c.onCancel();
                    return;
                } else {
                    this.f82386c.c();
                    return;
                }
            }
            this.f82385b.isHideAnimationRunning = false;
            this.f82385b.hideValueAnimator = null;
            if (this.f82385b.isHideAnimationCancelled) {
                this.f82386c.onCancel();
            } else {
                this.f82386c.c();
            }
        }
    }

    private final void B(final boolean isShowAnimation, final float animationStart, final float animationEnd, final b onAnimatorEventListener) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: j00.a
            @Override // java.lang.Runnable
            public final void run() {
                c.C(this.f82334a, isShowAnimation, onAnimatorEventListener, animationStart, animationEnd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(c cVar, boolean z11, final b bVar, float f11, float f12) {
        cVar.isHideAnimationCancelled = z11;
        cVar.isShowAnimationCancelled = !z11;
        if (z11) {
            ValueAnimator valueAnimator = cVar.hideValueAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else {
            ValueAnimator valueAnimator2 = cVar.showValueAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        bVar.b();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f12);
        valueAnimatorOfFloat.setDuration(z11 ? cVar.showAnimationDuration : cVar.hideAnimationDuration);
        valueAnimatorOfFloat.setStartDelay(z11 ? cVar.showAnimationDelay : cVar.hideAnimationDelay);
        valueAnimatorOfFloat.setInterpolator(cVar.animationInterpolator);
        valueAnimatorOfFloat.addListener(new k(z11, cVar, bVar));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j00.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                c.D(bVar, valueAnimator3);
            }
        });
        valueAnimatorOfFloat.start();
        if (z11) {
            cVar.showValueAnimator = valueAnimatorOfFloat;
        } else {
            cVar.hideValueAnimator = valueAnimatorOfFloat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(b bVar, ValueAnimator it) {
        s.k(it, "it");
        Object animatedValue = it.getAnimatedValue();
        s.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        bVar.a(((Float) animatedValue).floatValue());
    }

    private final int t(int softInputHeight, ScrollView scrollView, View currentFocusedView) {
        int[] iArr = new int[2];
        scrollView.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        currentFocusedView.getLocationOnScreen(iArr2);
        return Math.min(Math.max(softInputHeight - com.p005reactnativeavoidsoftinput.View.j(currentFocusedView), 0), Math.max(iArr2[1] - iArr[1], 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int offset) {
        l<? super Integer, h0> lVar = this.onOffsetChangedListener;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(offset));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(View rootView, float animatedOffset) {
        w(com.p005reactnativeavoidsoftinput.View.c((int) animatedOffset));
        rootView.setTranslationY(-animatedOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ScrollView scrollView, float animatedOffset) {
        int i11 = (int) animatedOffset;
        w(com.p005reactnativeavoidsoftinput.View.c(i11));
        scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), this.initialScrollViewBottomPadding + i11);
    }

    public void A(ScrollView scrollView, int initialScrollValue, wn0.a<h0> onOffsetAnimationEnd) {
        s.k(scrollView, "scrollView");
        s.k(onOffsetAnimationEnd, "onOffsetAnimationEnd");
        this.isHideAnimationRunning = true;
        B(false, this.bottomOffset, BitmapDescriptorFactory.HUE_RED, new j(scrollView, initialScrollValue, onOffsetAnimationEnd));
    }

    public void E(float offset) {
        this.avoidOffset = w.h(offset);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    public void F(String easing) {
        j00.d.Companion.EnumC1718a enumC1718a;
        j00.d dVar = this.animationInterpolator;
        if (easing == null) {
            enumC1718a = j00.d.Companion.EnumC1718a.LINEAR;
        } else {
            int iHashCode = easing.hashCode();
            if (iHashCode != -1965087616) {
                if (iHashCode != -1310316109) {
                    if (iHashCode == 1330629787 && easing.equals("easeInOut")) {
                        enumC1718a = j00.d.Companion.EnumC1718a.EASE_IN_OUT;
                    } else {
                        enumC1718a = j00.d.Companion.EnumC1718a.LINEAR;
                    }
                } else if (easing.equals("easeIn")) {
                    enumC1718a = j00.d.Companion.EnumC1718a.EASE_IN;
                } else {
                    enumC1718a = j00.d.Companion.EnumC1718a.LINEAR;
                }
            } else if (easing.equals("easeOut")) {
                enumC1718a = j00.d.Companion.EnumC1718a.EASE_OUT;
            } else {
                enumC1718a = j00.d.Companion.EnumC1718a.LINEAR;
            }
        }
        dVar.a(enumC1718a);
    }

    public void G(Integer delay) {
        this.hideAnimationDelay = delay != null ? delay.intValue() : 0L;
    }

    public void H(Integer duration) {
        this.hideAnimationDuration = duration != null ? duration.intValue() : 220L;
    }

    public void I(l<? super Integer, h0> listener) {
        this.onOffsetChangedListener = listener;
    }

    public void J(Integer delay) {
        this.showAnimationDelay = delay != null ? delay.intValue() : 0L;
    }

    public void K(Integer duration) {
        this.showAnimationDuration = duration != null ? duration.intValue() : 660L;
    }

    public void o(int to2, View rootView, View focusedView, wn0.a<h0> onOffsetAnimationEnd) {
        s.k(rootView, "rootView");
        s.k(focusedView, "focusedView");
        s.k(onOffsetAnimationEnd, "onOffsetAnimationEnd");
        this.isShowAnimationRunning = true;
        float fMax = Math.max(to2 - com.p005reactnativeavoidsoftinput.View.j(focusedView), 0) + this.avoidOffset;
        this.bottomOffset = fMax;
        if (fMax <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        B(true, BitmapDescriptorFactory.HUE_RED, fMax, new C1717c(onOffsetAnimationEnd, rootView));
    }

    public void p(int softInputHeight, ScrollView scrollView, View currentFocusedView, wn0.a<h0> onOffsetAnimationEnd) {
        s.k(scrollView, "scrollView");
        s.k(currentFocusedView, "currentFocusedView");
        s.k(onOffsetAnimationEnd, "onOffsetAnimationEnd");
        this.isShowAnimationRunning = true;
        this.bottomOffset = Math.max(softInputHeight - com.p005reactnativeavoidsoftinput.View.j(scrollView), 0) + this.avoidOffset;
        int iT = t(softInputHeight, scrollView, currentFocusedView);
        float f11 = this.bottomOffset;
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        B(true, BitmapDescriptorFactory.HUE_RED, f11, new d(scrollView, onOffsetAnimationEnd, iT));
    }

    public void q() {
        this.bottomOffset = BitmapDescriptorFactory.HUE_RED;
        this.initialScrollViewBottomPadding = 0;
    }

    public void r(int from, int to2, View rootView) {
        s.k(rootView, "rootView");
        this.isHideAnimationRunning = true;
        float f11 = this.isShowAnimationRunning ? this.bottomOffset : (to2 - from) + this.bottomOffset;
        B(false, this.bottomOffset, f11, new e(f11, rootView));
    }

    public void s(int from, int to2, ScrollView scrollView, View focusedView) {
        s.k(scrollView, "scrollView");
        s.k(focusedView, "focusedView");
        this.isHideAnimationRunning = true;
        float f11 = this.isShowAnimationRunning ? this.bottomOffset : (to2 - from) + this.bottomOffset;
        B(false, this.bottomOffset, f11, new f(f11, scrollView, t(to2, scrollView, focusedView)));
    }

    public void u(int from, int to2, View rootView) {
        s.k(rootView, "rootView");
        this.isShowAnimationRunning = true;
        float f11 = this.isHideAnimationRunning ? this.bottomOffset : (to2 - from) + this.bottomOffset;
        B(true, this.bottomOffset, f11, new g(f11, rootView));
    }

    public void v(int from, int to2, ScrollView scrollView, View currentFocusedView) {
        s.k(scrollView, "scrollView");
        s.k(currentFocusedView, "currentFocusedView");
        this.isShowAnimationRunning = true;
        float f11 = this.isHideAnimationRunning ? this.bottomOffset : (to2 - from) + this.bottomOffset;
        B(true, this.bottomOffset, f11, new h(f11, scrollView, t(to2, scrollView, currentFocusedView)));
    }

    public void z(View rootView, wn0.a<h0> onOffsetAnimationEnd) {
        s.k(rootView, "rootView");
        s.k(onOffsetAnimationEnd, "onOffsetAnimationEnd");
        this.isHideAnimationRunning = true;
        B(false, this.bottomOffset, BitmapDescriptorFactory.HUE_RED, new i(onOffsetAnimationEnd, rootView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj00/c$b;", "", "Ljn0/h0;", "b", "()V", "onCancel", "c", "", "animatedValue", "a", "(F)V", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface b {
        void a(float animatedValue);

        void b();

        void c();

        void onCancel();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a {
            public static void a(b bVar) {
            }

            public static void b(b bVar) {
            }
        }
    }
}
