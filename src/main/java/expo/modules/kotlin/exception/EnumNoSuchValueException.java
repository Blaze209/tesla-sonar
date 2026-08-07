package expo.modules.kotlin.exception;

import co0.d;
import expo.modules.kotlin.exception.EnumNoSuchValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/exception/EnumNoSuchValueException;", "Lexpo/modules/kotlin/exception/CodedException;", "Lco0/d;", "", "enumType", "", "enumConstants", "", "value", "<init>", "(Lco0/d;[Ljava/lang/Enum;Ljava/lang/Object;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnumNoSuchValueException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumNoSuchValueException(d<Enum<?>> enumType, Enum<?>[] enumConstants, Object obj) {
        super("'" + obj + "' is not present in " + enumType.l() + " enum, it must be one of: " + n.T0(enumConstants, ", ", null, null, 0, null, new l() { // from class: vj0.a
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return EnumNoSuchValueException._init_$lambda$0((Enum) obj2);
            }
        }, 30, null), null, 2, null);
        s.k(enumType, "enumType");
        s.k(enumConstants, "enumConstants");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _init_$lambda$0(Enum it) {
        s.k(it, "it");
        return "'" + it.name() + "'";
    }
}
