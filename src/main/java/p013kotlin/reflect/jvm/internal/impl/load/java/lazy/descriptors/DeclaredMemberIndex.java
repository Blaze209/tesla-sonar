package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public interface DeclaredMemberIndex {

    public static final class Empty implements DeclaredMemberIndex {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public JavaField findFieldByName(Name name) {
            s.k(name, "name");
            return null;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public JavaRecordComponent findRecordComponentByName(Name name) {
            s.k(name, "name");
            return null;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public Set<Name> getFieldNames() {
            return d1.d();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public Set<Name> getMethodNames() {
            return d1.d();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public Set<Name> getRecordComponentNames() {
            return d1.d();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public List<JavaMethod> findMethodsByName(Name name) {
            s.k(name, "name");
            return v.m();
        }
    }

    JavaField findFieldByName(Name name);

    Collection<JavaMethod> findMethodsByName(Name name);

    JavaRecordComponent findRecordComponentByName(Name name);

    Set<Name> getFieldNames();

    Set<Name> getMethodNames();

    Set<Name> getRecordComponentNames();
}
