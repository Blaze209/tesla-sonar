package wc;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import sc.Size;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lwc/a;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "input", "Lsc/g;", "size", "b", "(Landroid/graphics/Bitmap;Lsc/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "cacheKey", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {
    public abstract String a();

    public abstract Object b(Bitmap bitmap, Size size, Continuation<? super Bitmap> continuation);

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof a) && s.f(a(), ((a) other).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return o0.b(getClass()).l() + "(cacheKey=" + a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
