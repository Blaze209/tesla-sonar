package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import cb.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f13916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f13917e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final Context f13920c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final Set<Class<? extends cb.a<?>>> f13919b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Map<Class<?>, Object> f13918a = new HashMap();

    a(@NonNull Context context) {
        this.f13920c = context.getApplicationContext();
    }

    @NonNull
    private <T> T d(@NonNull Class<? extends cb.a<?>> cls, @NonNull Set<Class<?>> set) {
        T t11;
        if (eb.a.h()) {
            try {
                eb.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                eb.a.f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f13918a.containsKey(cls)) {
            t11 = (T) this.f13918a.get(cls);
        } else {
            set.add(cls);
            try {
                cb.a<?> aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends cb.a<?>>> listB = aVarNewInstance.b();
                if (!listB.isEmpty()) {
                    for (Class<? extends cb.a<?>> cls2 : listB) {
                        if (!this.f13918a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t11 = (T) aVarNewInstance.a(this.f13920c);
                set.remove(cls);
                this.f13918a.put(cls, t11);
            } catch (Throwable th3) {
                throw new StartupException(th3);
            }
        }
        eb.a.f();
        return t11;
    }

    @NonNull
    public static a e(@NonNull Context context) {
        if (f13916d == null) {
            synchronized (f13917e) {
                try {
                    if (f13916d == null) {
                        f13916d = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f13916d;
    }

    void a() {
        try {
            try {
                eb.a.c("Startup");
                b(this.f13920c.getPackageManager().getProviderInfo(new ComponentName(this.f13920c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                eb.a.f();
            } catch (PackageManager.NameNotFoundException e11) {
                throw new StartupException(e11);
            }
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    void b(Bundle bundle) {
        String string = this.f13920c.getString(b.f19018a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (cb.a.class.isAssignableFrom(cls)) {
                            this.f13919b.add((Class<? extends cb.a<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends cb.a<?>>> it = this.f13919b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e11) {
                throw new StartupException(e11);
            }
        }
    }

    @NonNull
    <T> T c(@NonNull Class<? extends cb.a<?>> cls) {
        T t11;
        synchronized (f13917e) {
            try {
                t11 = (T) this.f13918a.get(cls);
                if (t11 == null) {
                    t11 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    @NonNull
    public <T> T f(@NonNull Class<? extends cb.a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@NonNull Class<? extends cb.a<?>> cls) {
        return this.f13919b.contains(cls);
    }
}
