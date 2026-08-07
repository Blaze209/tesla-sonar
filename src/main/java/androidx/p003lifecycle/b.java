package androidx.p003lifecycle;

import android.app.Application;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/b;", "Landroidx/lifecycle/c1;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "T", "f", "()Landroid/app/Application;", "s", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    public b(Application application) {
        s.k(application, "application");
        this.application = application;
    }

    public <T extends Application> T f() {
        T t11 = (T) this.application;
        s.i(t11, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t11;
    }
}
