package io.realm.internal;

import android.content.Context;
import io.realm.c0;
import io.realm.exceptions.RealmException;
import io.realm.i0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes9.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f79083a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static i f79084b;

    public interface a {
    }

    public interface b {
    }

    static {
        f79084b = null;
        try {
            f79084b = (i) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e11) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e11);
        } catch (InstantiationException e12) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e12);
        } catch (NoSuchMethodException e13) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e13);
        } catch (InvocationTargetException e14) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e14.getTargetException());
        }
    }

    public static i c(boolean z11) {
        return z11 ? f79084b : f79083a;
    }

    public static i e() {
        i iVar = f79084b;
        return iVar != null ? iVar : f79083a;
    }

    public void a(c0 c0Var, i0 i0Var) {
    }

    public void b(i0 i0Var) {
    }

    public Object[] d(i0 i0Var) {
        return new Object[19];
    }

    public String f(i0 i0Var) {
        return null;
    }

    public String g(i0 i0Var) {
        return null;
    }

    public void h(Context context, String str, a aVar, b bVar) {
    }

    public void i(i0 i0Var) {
    }

    public void j(OsRealmConfig osRealmConfig) {
    }
}
