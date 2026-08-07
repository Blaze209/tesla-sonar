package md0;

import io.sentry.c4;
import io.sentry.q7;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmd0/e;", "Lio/sentry/q7$n;", "<init>", "()V", "Lio/sentry/c4;", "samplingContext", "", "a", "(Lio/sentry/c4;)Ljava/lang/Double;", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements q7.n {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    @Override // io.sentry.q7.n
    public Double a(c4 samplingContext) {
        double d11;
        s.k(samplingContext, "samplingContext");
        switch (samplingContext.b().y()) {
            case "FIRST_PRODUCT_ON_SCREEN":
            case "ANDROID_INITIALIZER":
            case "ANDROID_TIME_TO_INTERACTIVE":
            case "JS_STARTUP":
            case "ANDROID_APPLICATION_ON_CREATE":
            case "GODOT_INITIALIZATION":
            case "APP_LAUNCH_GATE":
                d11 = 0.005d;
                break;
            default:
                d11 = 0.001d;
                break;
        }
        return Double.valueOf(d11);
    }
}
