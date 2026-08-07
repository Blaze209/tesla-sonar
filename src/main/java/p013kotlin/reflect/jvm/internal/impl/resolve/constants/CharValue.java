package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import ch.qos.logback.classic.spi.CallerData;
import java.util.Arrays;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c11) {
        super(Character.valueOf(c11));
    }

    private final String a(char c11) {
        switch (c11) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return b(c11) ? String.valueOf(c11) : CallerData.NA;
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean b(char c11) {
        byte type = (byte) Character.getType(c11);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(getValue().charValue()), a(getValue().charValue())}, 2));
        s.j(str, "format(...)");
        return str;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        s.k(module, "module");
        SimpleType charType = module.getBuiltIns().getCharType();
        s.j(charType, "getCharType(...)");
        return charType;
    }
}
