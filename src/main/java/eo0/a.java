package eo0;

import ch.qos.logback.core.CoreConstants;
import co0.i;
import co0.m;
import fo0.a0;
import fo0.i3;
import go0.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lco0/c;", "", "value", "a", "(Lco0/c;)Z", "b", "(Lco0/c;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final boolean a(co0.c<?> cVar) {
        h<?> hVarO;
        s.k(cVar, "<this>");
        if (cVar instanceof i) {
            m mVar = (m) cVar;
            Field fieldB = c.b(mVar);
            if (fieldB != null ? fieldB.isAccessible() : true) {
                Method methodC = c.c(mVar);
                if (methodC != null ? methodC.isAccessible() : true) {
                    Method methodE = c.e((i) cVar);
                    if (methodE != null ? methodE.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (cVar instanceof m) {
            m mVar2 = (m) cVar;
            Field fieldB2 = c.b(mVar2);
            if (fieldB2 != null ? fieldB2.isAccessible() : true) {
                Method methodC2 = c.c(mVar2);
                if (methodC2 != null ? methodC2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (cVar instanceof m.b) {
            Field fieldB3 = c.b(((m.b) cVar).a());
            if (fieldB3 != null ? fieldB3.isAccessible() : true) {
                Method methodD = c.d((co0.h) cVar);
                if (methodD != null ? methodD.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (cVar instanceof i.a) {
            Field fieldB4 = c.b(((i.a) cVar).a());
            if (fieldB4 != null ? fieldB4.isAccessible() : true) {
                Method methodD2 = c.d((co0.h) cVar);
                if (methodD2 != null ? methodD2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(cVar instanceof co0.h)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        co0.h hVar = (co0.h) cVar;
        Method methodD3 = c.d(hVar);
        if (methodD3 != null ? methodD3.isAccessible() : true) {
            a0<?> a0VarB = i3.b(cVar);
            Member memberB = (a0VarB == null || (hVarO = a0VarB.O()) == null) ? null : hVarO.b();
            AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorA = c.a(hVar);
                if (constructorA != null ? constructorA.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void b(co0.c<?> cVar, boolean z11) {
        h<?> hVarO;
        s.k(cVar, "<this>");
        if (cVar instanceof i) {
            m mVar = (m) cVar;
            Field fieldB = c.b(mVar);
            if (fieldB != null) {
                fieldB.setAccessible(z11);
            }
            Method methodC = c.c(mVar);
            if (methodC != null) {
                methodC.setAccessible(z11);
            }
            Method methodE = c.e((i) cVar);
            if (methodE != null) {
                methodE.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof m) {
            m mVar2 = (m) cVar;
            Field fieldB2 = c.b(mVar2);
            if (fieldB2 != null) {
                fieldB2.setAccessible(z11);
            }
            Method methodC2 = c.c(mVar2);
            if (methodC2 != null) {
                methodC2.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof m.b) {
            Field fieldB3 = c.b(((m.b) cVar).a());
            if (fieldB3 != null) {
                fieldB3.setAccessible(z11);
            }
            Method methodD = c.d((co0.h) cVar);
            if (methodD != null) {
                methodD.setAccessible(z11);
                return;
            }
            return;
        }
        if (cVar instanceof i.a) {
            Field fieldB4 = c.b(((i.a) cVar).a());
            if (fieldB4 != null) {
                fieldB4.setAccessible(z11);
            }
            Method methodD2 = c.d((co0.h) cVar);
            if (methodD2 != null) {
                methodD2.setAccessible(z11);
                return;
            }
            return;
        }
        if (!(cVar instanceof co0.h)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        co0.h hVar = (co0.h) cVar;
        Method methodD3 = c.d(hVar);
        if (methodD3 != null) {
            methodD3.setAccessible(z11);
        }
        a0<?> a0VarB = i3.b(cVar);
        Member memberB = (a0VarB == null || (hVarO = a0VarB.O()) == null) ? null : hVarO.b();
        AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor constructorA = c.a(hVar);
        if (constructorA != null) {
            constructorA.setAccessible(z11);
        }
    }
}
