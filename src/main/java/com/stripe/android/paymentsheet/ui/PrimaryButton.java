package com.stripe.android.paymentsheet.ui;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.a3;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import ezvcard.property.Gender;
import f90.PrimaryButtonStyle;
import f90.m;
import f90.n;
import jn0.h0;
import n70.t;
import n70.x;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p008h80.j0;
import p008h80.l0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import w4.h;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u00025<B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\b\b\u0001\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\b\b\u0001\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\b\b\u0001\u0010 \u001a\u00020\u0006¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u00020\u000f2\b\b\u0001\u0010#\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\"J\u0019\u0010'\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104R*\u0010;\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b:\u0010\u0013\u001a\u0004\b7\u00108\"\u0004\b9\u0010(R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010CR*\u0010I\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010A\u0012\u0004\bH\u0010\u0013\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u0011R \u0010O\u001a\u00020J8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010K\u0012\u0004\bN\u0010\u0013\u001a\u0004\bL\u0010MR\"\u0010T\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010,R\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0016\u0010`\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010_R\u0016\u0010d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010_¨\u0006e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "c", "(Landroid/util/AttributeSet;)Ljava/lang/CharSequence;", "Lx30/c;", "text", "Ljn0/h0;", "setLabel", "(Lx30/c;)V", "e", "()V", "f", "Lkotlin/Function0;", "onAnimationEnd", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)V", "g", "Lf90/d;", "primaryButtonStyle", "Landroid/content/res/ColorStateList;", "tintList", "setAppearanceConfiguration", "(Lf90/d;Landroid/content/res/ColorStateList;)V", "color", "setDefaultLabelColor", "(I)V", "drawable", "setLockIconDrawable", "setIndicatorColor", "setConfirmedIconDrawable", "setBackgroundTintList", "(Landroid/content/res/ColorStateList;)V", "", "enabled", "setEnabled", "(Z)V", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "uiState", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;)V", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "state", "h", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;)V", "a", "Landroid/content/res/ColorStateList;", "getDefaultTintList$paymentsheet_release", "()Landroid/content/res/ColorStateList;", "setDefaultTintList$paymentsheet_release", "getDefaultTintList$paymentsheet_release$annotations", "defaultTintList", "b", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "Lh80/j0;", "Lh80/j0;", "animator", "Lx30/c;", "originalLabel", "Ljava/lang/Integer;", "defaultLabelColor", "getExternalLabel$paymentsheet_release", "()Lx30/c;", "setExternalLabel$paymentsheet_release", "getExternalLabel$paymentsheet_release$annotations", "externalLabel", "Ls70/b;", "Ls70/b;", "getViewBinding$paymentsheet_release", "()Ls70/b;", "getViewBinding$paymentsheet_release$annotations", "viewBinding", "Z", "getLockVisible$paymentsheet_release", "()Z", "setLockVisible$paymentsheet_release", "lockVisible", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "confirmedIcon", "", "j", Gender.FEMALE, "cornerRadius", "k", "borderStrokeWidth", "l", "I", "borderStrokeColor", "m", "finishedBackgroundColor", "n", "finishedOnBackgroundColor", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PrimaryButton extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ColorStateList defaultTintList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j0 animator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private x30.c originalLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer defaultLabelColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private x30.c externalLabel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final s70.b viewBinding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean lockVisible;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ImageView confirmedIcon;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float cornerRadius;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float borderStrokeWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int borderStrokeColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int finishedBackgroundColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int finishedOnBackgroundColor;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "", "", "isProcessing", "<init>", "(Z)V", "a", "Z", "()Z", "b", "c", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a$a;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a$b;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isProcessing;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a$a;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "Lkotlin/Function0;", "Ljn0/h0;", "onComplete", "<init>", "(Lwn0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lwn0/a;", "a", "()Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FinishProcessing extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<h0> onComplete;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinishProcessing(wn0.a<h0> onComplete) {
                super(true, null);
                s.k(onComplete, "onComplete");
                this.onComplete = onComplete;
            }

            public final wn0.a<h0> a() {
                return this.onComplete;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FinishProcessing) && s.f(this.onComplete, ((FinishProcessing) other).onComplete);
            }

            public int hashCode() {
                return this.onComplete.hashCode();
            }

            public String toString() {
                return "FinishProcessing(onComplete=" + this.onComplete + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a$b;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f53601b = new b();

            private b() {
                super(false, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -745924076;
            }

            public String toString() {
                return "Ready";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a$c;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f53602b = new c();

            private c() {
                super(true, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -198876090;
            }

            public String toString() {
                return "StartProcessing";
            }
        }

        public /* synthetic */ a(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11);
        }

        private a(boolean z11) {
            this.isProcessing = z11;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "", "Lx30/c;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "", "enabled", "lockVisible", "<init>", "(Lx30/c;Lwn0/a;ZZ)V", "a", "(Lx30/c;Lwn0/a;ZZ)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "()Lx30/c;", "b", "Lwn0/a;", "f", "()Lwn0/a;", "c", "Z", "()Z", "e", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.a<h0> onClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean lockVisible;

        public UIState(x30.c label, wn0.a<h0> onClick, boolean z11, boolean z12) {
            s.k(label, "label");
            s.k(onClick, "onClick");
            this.label = label;
            this.onClick = onClick;
            this.enabled = z11;
            this.lockVisible = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UIState b(UIState uIState, x30.c cVar, wn0.a aVar, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = uIState.label;
            }
            if ((i11 & 2) != 0) {
                aVar = uIState.onClick;
            }
            if ((i11 & 4) != 0) {
                z11 = uIState.enabled;
            }
            if ((i11 & 8) != 0) {
                z12 = uIState.lockVisible;
            }
            return uIState.a(cVar, aVar, z11, z12);
        }

        public final UIState a(x30.c label, wn0.a<h0> onClick, boolean enabled, boolean lockVisible) {
            s.k(label, "label");
            s.k(onClick, "onClick");
            return new UIState(label, onClick, enabled, lockVisible);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final x30.c getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getLockVisible() {
            return this.lockVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UIState)) {
                return false;
            }
            UIState uIState = (UIState) other;
            return s.f(this.label, uIState.label) && s.f(this.onClick, uIState.onClick) && this.enabled == uIState.enabled && this.lockVisible == uIState.lockVisible;
        }

        public final wn0.a<h0> f() {
            return this.onClick;
        }

        public int hashCode() {
            return (((((this.label.hashCode() * 31) + this.onClick.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.lockVisible);
        }

        public String toString() {
            return "UIState(label=" + this.label + ", onClick=" + this.onClick + ", enabled=" + this.enabled + ", lockVisible=" + this.lockVisible + ")";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f53607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(wn0.a<h0> aVar) {
            super(0);
            this.f53607c = aVar;
        }

        public final void b() {
            this.f53607c.invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x30.c f53608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PrimaryButton f53609d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x30.c cVar, PrimaryButton primaryButton) {
            super(2);
            this.f53608c = cVar;
            this.f53609d = primaryButton;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-47128405, i11, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.setLabel.<anonymous>.<anonymous> (PrimaryButton.kt:162)");
            }
            l0.a(p90.a.a(this.f53608c, lVar, 8), this.f53609d.defaultLabelColor, lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final CharSequence c(AttributeSet attrs) {
        Context context = getContext();
        s.j(context, "getContext(...)");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, v.l1(v.e(Integer.valueOf(R.attr.text))), 0, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        typedArrayObtainStyledAttributes.recycle();
        return text;
    }

    private final void d(wn0.a<h0> onAnimationEnd) {
        setClickable(false);
        setBackgroundTintList(ColorStateList.valueOf(this.finishedBackgroundColor));
        this.confirmedIcon.setImageTintList(ColorStateList.valueOf(this.finishedOnBackgroundColor));
        j0 j0Var = this.animator;
        ComposeView label = this.viewBinding.f110518d;
        s.j(label, "label");
        j0Var.e(label);
        j0 j0Var2 = this.animator;
        CircularProgressIndicator confirmingIcon = this.viewBinding.f110517c;
        s.j(confirmingIcon, "confirmingIcon");
        j0Var2.e(confirmingIcon);
        this.animator.d(this.confirmedIcon, getWidth(), new c(onAnimationEnd));
    }

    private final void e() {
        setClickable(true);
        x30.c cVar = this.originalLabel;
        if (cVar != null) {
            setLabel(cVar);
        }
        ColorStateList colorStateList = this.defaultTintList;
        if (colorStateList != null) {
            setBackgroundTintList(colorStateList);
        }
        ImageView lockIcon = this.viewBinding.f110519e;
        s.j(lockIcon, "lockIcon");
        lockIcon.setVisibility(this.lockVisible ? 0 : 8);
        CircularProgressIndicator confirmingIcon = this.viewBinding.f110517c;
        s.j(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(8);
    }

    private final void f() {
        ImageView lockIcon = this.viewBinding.f110519e;
        s.j(lockIcon, "lockIcon");
        lockIcon.setVisibility(8);
        CircularProgressIndicator confirmingIcon = this.viewBinding.f110517c;
        s.j(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(0);
        setClickable(false);
        setLabel(x30.d.a(x.X));
    }

    private final void g() {
        ComposeView label = this.viewBinding.f110518d;
        s.j(label, "label");
        ImageView lockIcon = this.viewBinding.f110519e;
        s.j(lockIcon, "lockIcon");
        for (View view : v.p(label, lockIcon)) {
            a aVar = this.state;
            view.setAlpha(((aVar == null || (aVar instanceof a.b)) && !isEnabled()) ? 0.5f : 1.0f);
        }
    }

    public static /* synthetic */ void getDefaultTintList$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getExternalLabel$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(UIState uIState, View view) {
        uIState.f().invoke();
    }

    private final void setLabel(x30.c text) {
        this.externalLabel = text;
        if (text != null) {
            if (!(this.state instanceof a.c)) {
                this.originalLabel = text;
            }
            this.viewBinding.f110518d.setContent(z2.c.c(-47128405, true, new d(text, this)));
        }
    }

    /* JADX INFO: renamed from: getDefaultTintList$paymentsheet_release, reason: from getter */
    public final ColorStateList getDefaultTintList() {
        return this.defaultTintList;
    }

    /* JADX INFO: renamed from: getExternalLabel$paymentsheet_release, reason: from getter */
    public final x30.c getExternalLabel() {
        return this.externalLabel;
    }

    /* JADX INFO: renamed from: getLockVisible$paymentsheet_release, reason: from getter */
    public final boolean getLockVisible() {
        return this.lockVisible;
    }

    /* JADX INFO: renamed from: getViewBinding$paymentsheet_release, reason: from getter */
    public final s70.b getViewBinding() {
        return this.viewBinding;
    }

    public final void h(a state) {
        this.state = state;
        g();
        if (state instanceof a.b) {
            e();
        } else if (s.f(state, a.c.f53602b)) {
            f();
        } else if (state instanceof a.FinishProcessing) {
            d(((a.FinishProcessing) state).a());
        }
    }

    public final void i(final UIState uiState) {
        setVisibility(uiState != null ? 0 : 8);
        if (uiState != null) {
            a aVar = this.state;
            if (!(aVar instanceof a.c) && !(aVar instanceof a.FinishProcessing)) {
                setLabel(uiState.getLabel());
            }
            setEnabled(uiState.getEnabled());
            this.lockVisible = uiState.getLockVisible();
            ImageView lockIcon = this.viewBinding.f110519e;
            s.j(lockIcon, "lockIcon");
            lockIcon.setVisibility(this.lockVisible ? 0 : 8);
            setOnClickListener(new View.OnClickListener() { // from class: h80.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrimaryButton.j(uiState, view);
                }
            });
        }
    }

    public final void setAppearanceConfiguration(PrimaryButtonStyle primaryButtonStyle, ColorStateList tintList) {
        s.k(primaryButtonStyle, "primaryButtonStyle");
        Context context = getContext();
        s.j(context, "getContext(...)");
        this.cornerRadius = n.c(context, h.g(primaryButtonStyle.getShape().getCornerRadius()));
        Context context2 = getContext();
        s.j(context2, "getContext(...)");
        this.borderStrokeWidth = n.c(context2, h.g(primaryButtonStyle.getShape().getBorderStrokeWidth()));
        Context context3 = getContext();
        s.j(context3, "getContext(...)");
        this.borderStrokeColor = n.f(primaryButtonStyle, context3);
        ImageView imageView = this.viewBinding.f110519e;
        Context context4 = getContext();
        s.j(context4, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(n.k(primaryButtonStyle, context4)));
        this.defaultTintList = tintList;
        setBackgroundTintList(tintList);
        Context context5 = getContext();
        s.j(context5, "getContext(...)");
        this.finishedBackgroundColor = n.q(primaryButtonStyle, context5);
        Context context6 = getContext();
        s.j(context6, "getContext(...)");
        this.finishedOnBackgroundColor = n.l(primaryButtonStyle, context6);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList tintList) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.cornerRadius);
        gradientDrawable.setColor(tintList);
        gradientDrawable.setStroke((int) this.borderStrokeWidth, this.borderStrokeColor);
        setBackground(gradientDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(t.f93468h);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void setConfirmedIconDrawable(int drawable) {
        this.viewBinding.f110516b.setImageResource(drawable);
    }

    public final void setDefaultLabelColor(int color) {
        this.defaultLabelColor = Integer.valueOf(color);
    }

    public final void setDefaultTintList$paymentsheet_release(ColorStateList colorStateList) {
        this.defaultTintList = colorStateList;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        g();
    }

    public final void setExternalLabel$paymentsheet_release(x30.c cVar) {
        this.externalLabel = cVar;
    }

    public final void setIndicatorColor(int color) {
        this.viewBinding.f110517c.setIndicatorColor(color);
    }

    public final void setLockIconDrawable(int drawable) {
        this.viewBinding.f110519e.setImageResource(drawable);
    }

    public final void setLockVisible$paymentsheet_release(boolean z11) {
        this.lockVisible = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ PrimaryButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        this.animator = new j0(context);
        s70.b bVarB = s70.b.b(LayoutInflater.from(context), this);
        s.j(bVarB, "inflate(...)");
        this.viewBinding = bVarB;
        this.lockVisible = true;
        ImageView confirmedIcon = bVarB.f110516b;
        s.j(confirmedIcon, "confirmedIcon");
        this.confirmedIcon = confirmedIcon;
        m mVar = m.f64661a;
        this.cornerRadius = n.c(context, h.g(mVar.d().getShape().getCornerRadius()));
        this.borderStrokeWidth = n.c(context, h.g(mVar.d().getShape().getBorderStrokeWidth()));
        this.borderStrokeColor = n.f(mVar.d(), context);
        this.finishedBackgroundColor = n.q(mVar.d(), context);
        this.finishedOnBackgroundColor = n.l(mVar.d(), context);
        bVarB.f110518d.setViewCompositionStrategy(a3.c.f5650b);
        CharSequence charSequenceC = c(attributeSet);
        if (charSequenceC != null) {
            setLabel(x30.d.b(charSequenceC.toString()));
        }
        setClickable(true);
        setEnabled(false);
    }
}
