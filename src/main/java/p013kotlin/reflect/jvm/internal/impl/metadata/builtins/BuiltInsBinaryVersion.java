package p013kotlin.reflect.jvm.internal.impl.metadata.builtins;

import bo0.j;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* JADX INFO: loaded from: classes9.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 7);
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BuiltInsBinaryVersion readFrom(InputStream stream) {
            s.k(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            j jVar = new j(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(v.y(jVar, 10));
            Iterator<Integer> it = jVar.iterator();
            while (it.hasNext()) {
                ((s0) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrL1 = v.l1(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(iArrL1, iArrL1.length));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        s.k(numbers, "numbers");
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        return a(INSTANCE);
    }
}
