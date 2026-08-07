package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.c;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.f1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {

    public interface a<D> {
        @NonNull
        c<D> onCreateLoader(int i11, Bundle bundle);

        void onLoadFinished(@NonNull c<D> cVar, D d11);

        void onLoaderReset(@NonNull c<D> cVar);
    }

    @NonNull
    public static <T extends LifecycleOwner & f1> LoaderManager b(@NonNull T t11) {
        return new androidx.loader.app.a(t11, t11.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    public abstract <D> c<D> c(int i11, Bundle bundle, @NonNull a<D> aVar);

    public abstract void d();
}
