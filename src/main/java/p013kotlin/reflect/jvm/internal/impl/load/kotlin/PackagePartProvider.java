package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public interface PackagePartProvider {

    public static final class Empty implements PackagePartProvider {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        public List<String> findPackageParts(String packageFqName) {
            s.k(packageFqName, "packageFqName");
            return v.m();
        }
    }

    List<String> findPackageParts(String str);
}
