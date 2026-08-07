package rj;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p003lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<Lifecycle, com.bumptech.glide.l> f108419a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final o.b f108420b;

    private final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FragmentManager f108423a;

        b(FragmentManager fragmentManager) {
            this.f108423a = fragmentManager;
        }

        private void b(FragmentManager fragmentManager, Set<com.bumptech.glide.l> set) {
            List<Fragment> listA0 = fragmentManager.A0();
            int size = listA0.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = listA0.get(i11);
                b(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.l lVarA = m.this.a(fragment.getLifecycle());
                if (lVarA != null) {
                    set.add(lVarA);
                }
            }
        }

        @Override // rj.p
        @NonNull
        public Set<com.bumptech.glide.l> a() {
            HashSet hashSet = new HashSet();
            b(this.f108423a, hashSet);
            return hashSet;
        }
    }

    m(@NonNull o.b bVar) {
        this.f108420b = bVar;
    }

    com.bumptech.glide.l a(Lifecycle lifecycle) {
        xj.l.b();
        return this.f108419a.get(lifecycle);
    }

    com.bumptech.glide.l b(Context context, com.bumptech.glide.c cVar, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z11) {
        xj.l.b();
        com.bumptech.glide.l lVarA = a(lifecycle);
        if (lVarA != null) {
            return lVarA;
        }
        k kVar = new k(lifecycle);
        com.bumptech.glide.l lVarA2 = this.f108420b.a(cVar, kVar, new b(fragmentManager), context);
        this.f108419a.put(lifecycle, lVarA2);
        kVar.a(new a(lifecycle));
        if (z11) {
            lVarA2.onStart();
        }
        return lVarA2;
    }

    class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lifecycle f108421a;

        a(Lifecycle lifecycle) {
            this.f108421a = lifecycle;
        }

        @Override // rj.l
        public void onDestroy() {
            m.this.f108419a.remove(this.f108421a);
        }

        @Override // rj.l
        public void onStart() {
        }

        @Override // rj.l
        public void onStop() {
        }
    }
}
