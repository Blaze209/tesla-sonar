package ql0;

import androidx.annotation.NonNull;
import sq0.y;

/* JADX INFO: loaded from: classes8.dex */
public interface l extends y {

    public interface a {
        void a(@NonNull l lVar, @NonNull sq0.r rVar);

        void b(@NonNull l lVar, @NonNull sq0.r rVar);
    }

    public interface b {
        @NonNull
        l a(@NonNull g gVar, @NonNull q qVar);

        @NonNull
        <N extends sq0.r> b b(@NonNull Class<N> cls, c<? super N> cVar);
    }

    public interface c<N extends sq0.r> {
        void a(@NonNull l lVar, @NonNull N n11);
    }

    void B();

    void b(int i11, Object obj);

    @NonNull
    t builder();

    void c(@NonNull sq0.r rVar);

    <N extends sq0.r> void e(@NonNull N n11, int i11);

    @NonNull
    q h();

    void i(@NonNull sq0.r rVar);

    @NonNull
    g l();

    int length();

    boolean m(@NonNull sq0.r rVar);

    void p();

    void s(@NonNull sq0.r rVar);
}
