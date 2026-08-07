package com.withpersona.sdk2.inquiry.shared.ui;

import ag.e;
import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ezvcard.property.Gender;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okio.c0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import tf.d0;
import tf.i;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "srcColor", "destColor", "Ljn0/h0;", Gender.FEMALE, "(II)V", "", ImagesContract.URL, "Lkotlinx/coroutines/Job;", "G", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "onDetachedFromWindow", "()V", "", "r", "Ljava/util/Map;", "srcColorToDestColor", "Lkotlinx/coroutines/CoroutineScope;", "s", "Lkotlinx/coroutines/CoroutineScope;", "scope", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThemeableLottieAnimationView extends LottieAnimationView {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, Integer> srcColorToDestColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope scope;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a", "Lig/c;", "", "Lig/b;", "frameInfo", DateTokenConverter.CONVERTER_KEY, "(Lig/b;)Ljava/lang/Integer;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ig.c<Integer> {
        a() {
        }

        @Override // ig.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer a(ig.b<Integer> frameInfo) {
            Integer num = (Integer) ThemeableLottieAnimationView.this.srcColorToDestColor.get(frameInfo != null ? frameInfo.g() : null);
            if (num != null) {
                return num;
            }
            if (frameInfo != null) {
                return frameInfo.b();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$b", "Lig/c;", "", "Lig/b;", "frameInfo", DateTokenConverter.CONVERTER_KEY, "(Lig/b;)Ljava/lang/Integer;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ig.c<Integer> {
        b() {
        }

        @Override // ig.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer a(ig.b<Integer> frameInfo) {
            Integer num = (Integer) ThemeableLottieAnimationView.this.srcColorToDestColor.get(frameInfo != null ? frameInfo.g() : null);
            if (num != null) {
                return num;
            }
            if (frameInfo != null) {
                return frameInfo.b();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1", f = "ThemeableLottieAnimationView.kt", i = {}, l = {66, 79}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58463n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f58464o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ThemeableLottieAnimationView f58465p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1$1", f = "ThemeableLottieAnimationView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f58466n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ ThemeableLottieAnimationView f58467o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f58468p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ThemeableLottieAnimationView themeableLottieAnimationView, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f58467o = themeableLottieAnimationView;
                this.f58468p = str;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f58467o, this.f58468p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f58466n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f58467o.setAnimationFromJson(this.f58468p, null);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, ThemeableLottieAnimationView themeableLottieAnimationView, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f58464o = str;
            this.f58465p = themeableLottieAnimationView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String b(String str) {
            try {
                InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(new URL(str));
                try {
                    s.h(inputStreamOpenStream);
                    String strT1 = c0.d(c0.m(inputStreamOpenStream)).t1();
                    sn0.b.a(inputStreamOpenStream, null);
                    return strT1;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(inputStreamOpenStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f58464o, this.f58465p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6) == r0) goto L17;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f58463n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r7)
                goto L4e
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                jn0.t.b(r7)
                goto L35
            L1e:
                jn0.t.b(r7)
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
                java.lang.String r1 = r6.f58464o
                com.withpersona.sdk2.inquiry.shared.ui.a r4 = new com.withpersona.sdk2.inquiry.shared.ui.a
                r4.<init>()
                r6.f58463n = r3
                java.lang.Object r7 = kotlinx.coroutines.InterruptibleKt.runInterruptible(r7, r4, r6)
                if (r7 != r0) goto L35
                goto L4d
            L35:
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L4e
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$c$a r3 = new com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$c$a
                com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView r4 = r6.f58465p
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.f58463n = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r7 != r0) goto L4e
            L4d:
                return r0
            L4e:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public ThemeableLottieAnimationView(Context context) {
        super(context);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
        j(new tf.c0() { // from class: ki0.q
            @Override // tf.c0
            public final void a(tf.i iVar) {
                ThemeableLottieAnimationView.D(this.f86154a, iVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(ThemeableLottieAnimationView themeableLottieAnimationView, i iVar) {
        themeableLottieAnimationView.k(new e("**"), d0.f113272a, themeableLottieAnimationView.new a());
        themeableLottieAnimationView.k(new e("**"), d0.f113273b, themeableLottieAnimationView.new b());
    }

    public final void F(int srcColor, int destColor) {
        this.srcColorToDestColor.put(Integer.valueOf(srcColor), Integer.valueOf(destColor));
    }

    public final Job G(String url) {
        s.k(url, "url");
        return BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new c(url, this, null), 3, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }

    public ThemeableLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
        j(new tf.c0() { // from class: ki0.q
            @Override // tf.c0
            public final void a(tf.i iVar) {
                ThemeableLottieAnimationView.D(this.f86154a, iVar);
            }
        });
    }

    public ThemeableLottieAnimationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
        j(new tf.c0() { // from class: ki0.q
            @Override // tf.c0
            public final void a(tf.i iVar) {
                ThemeableLottieAnimationView.D(this.f86154a, iVar);
            }
        });
    }
}
