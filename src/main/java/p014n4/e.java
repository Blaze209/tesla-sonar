package p014n4;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import j5.h;
import jn0.s;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln4/s0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Typeface;", "c", "(Ln4/s0;Landroid/content/Context;)Landroid/graphics/Typeface;", DateTokenConverter.CONVERTER_KEY, "(Ln4/s0;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"n4/e$a", "Lj5/h$f;", "Landroid/graphics/Typeface;", "typeface", "Ljn0/h0;", "g", "(Landroid/graphics/Typeface;)V", "", AnalyticsAttribute.Reason, "f", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<Typeface> f92905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResourceFont f92906b;

        /* JADX WARN: Multi-variable type inference failed */
        a(CancellableContinuation<? super Typeface> cancellableContinuation, ResourceFont resourceFont) {
            this.f92905a = cancellableContinuation;
            this.f92906b = resourceFont;
        }

        @Override // j5.h.f
        public void f(int reason) {
            this.f92905a.cancel(new IllegalStateException("Unable to load font " + this.f92906b + " (reason=" + reason + CoreConstants.RIGHT_PARENTHESIS_CHAR));
        }

        @Override // j5.h.f
        public void g(Typeface typeface) {
            this.f92905a.resumeWith(s.b(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(ResourceFont resourceFont, Context context) {
        Typeface typefaceH = h.h(context, resourceFont.getResId());
        p013kotlin.jvm.internal.s.h(typefaceH);
        return typefaceH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(ResourceFont resourceFont, Context context, Continuation<? super Typeface> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        h.j(context, resourceFont.getResId(), new a(cancellableContinuationImpl, resourceFont), null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
