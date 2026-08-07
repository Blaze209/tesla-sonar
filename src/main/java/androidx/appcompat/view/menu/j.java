package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    public interface a {
        void b(@NonNull e eVar, boolean z11);

        boolean c(@NonNull e eVar);
    }

    void b(e eVar, boolean z11);

    boolean c(e eVar, g gVar);

    Parcelable d();

    void e(boolean z11);

    boolean f();

    boolean g(e eVar, g gVar);

    int getId();

    void h(Context context, e eVar);

    void i(a aVar);

    void k(Parcelable parcelable);

    boolean l(m mVar);
}
