package androidx.p002activity.result;

import androidx.core.app.d;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H'¢\u0006\u0004\b\r\u0010\u0004R\u001e\u0010\u0011\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/activity/result/ActivityResultLauncher;", "I", "", "<init>", "()V", "input", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V", "Landroidx/core/app/d;", "options", "c", "(Ljava/lang/Object;Landroidx/core/app/d;)V", DateTokenConverter.CONVERTER_KEY, "Landroidx/activity/result/contract/ActivityResultContract;", "a", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityResultLauncher<I> {
    public abstract ActivityResultContract<I, ?> a();

    public void b(I input) {
        c(input, null);
    }

    public abstract void c(I input, d options);

    public abstract void d();
}
