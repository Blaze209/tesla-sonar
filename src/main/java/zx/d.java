package zx;

import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.k0;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface d extends cy.a<List<a>>, OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @k0(Lifecycle.a.ON_DESTROY)
    void close();

    @NonNull
    Task<List<a>> process(@NonNull wx.a aVar);
}
