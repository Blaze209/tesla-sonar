package f;

import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0019"}, d2 = {"Lf/h;", "I", Gender.OTHER, "Landroidx/activity/result/ActivityResultLauncher;", "Lf/a;", "launcher", "Lr2/y3;", "Landroidx/activity/result/contract/ActivityResultContract;", "currentContract", "<init>", "(Lf/a;Lr2/y3;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "input", "Landroidx/core/app/d;", "options", "c", "(Ljava/lang/Object;Landroidx/core/app/d;)V", "a", "Lf/a;", "b", "Lr2/y3;", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h<I, O> extends ActivityResultLauncher<I> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63722c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a<I> launcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y3<ActivityResultContract<I, O>> currentContract;

    /* JADX WARN: Multi-variable type inference failed */
    public h(a<I> aVar, y3<? extends ActivityResultContract<I, O>> y3Var) {
        this.launcher = aVar;
        this.currentContract = y3Var;
    }

    @Override // androidx.p002activity.result.ActivityResultLauncher
    public ActivityResultContract<I, O> a() {
        return this.currentContract.getValue();
    }

    @Override // androidx.p002activity.result.ActivityResultLauncher
    public void c(I input, androidx.core.app.d options) {
        this.launcher.a(input, options);
    }

    @Override // androidx.p002activity.result.ActivityResultLauncher
    @jn0.e
    public void d() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
