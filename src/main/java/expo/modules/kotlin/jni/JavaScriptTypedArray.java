package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.typedarray.TypedArray;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b$\u0010%J \u0010'\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0015H\u0096 ¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0018H\u0096 ¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u001dH\u0096 ¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020 H\u0096 ¢\u0006\u0004\b/\u00100J \u00101\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010&\u001a\u00020#H\u0096 ¢\u0006\u0004\b1\u00102R\u001b\u00108\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\tR\u001b\u0010>\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u0010\tR\u001b\u0010A\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\t¨\u0006B"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lexpo/modules/kotlin/typedarray/TypedArray;", "Lcom/facebook/jni/HybridData;", "hybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "getRawKind", "()I", "Ljava/nio/ByteBuffer;", "toDirectBuffer", "()Ljava/nio/ByteBuffer;", "", "buffer", "position", "size", "Ljn0/h0;", "read", "([BII)V", "write", "", "readByte", "(I)B", "", "read2Byte", "(I)S", "read4Byte", "(I)I", "", "read8Byte", "(I)J", "", "readFloat", "(I)F", "", "readDouble", "(I)D", "value", "writeByte", "(IB)V", "write2Byte", "(IS)V", "write4Byte", "(II)V", "write8Byte", "(IJ)V", "writeFloat", "(IF)V", "writeDouble", "(ID)V", "Lexpo/modules/kotlin/jni/TypedArrayKind;", "kind$delegate", "Lkotlin/Lazy;", "getKind", "()Lexpo/modules/kotlin/jni/TypedArrayKind;", "kind", "length$delegate", "getLength", "length", "byteLength$delegate", "getByteLength", "byteLength", "byteOffset$delegate", "getByteOffset", "byteOffset", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class JavaScriptTypedArray extends JavaScriptObject implements TypedArray {

    /* JADX INFO: renamed from: byteLength$delegate, reason: from kotlin metadata */
    private final Lazy byteLength;

    /* JADX INFO: renamed from: byteOffset$delegate, reason: from kotlin metadata */
    private final Lazy byteOffset;

    /* JADX INFO: renamed from: kind$delegate, reason: from kotlin metadata */
    private final Lazy kind;

    /* JADX INFO: renamed from: length$delegate, reason: from kotlin metadata */
    private final Lazy length;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @DoNotStrip
    public JavaScriptTypedArray(HybridData hybridData) {
        super(hybridData);
        s.k(hybridData, "hybridData");
        this.kind = m.b(new wn0.a() { // from class: expo.modules.kotlin.jni.c
            @Override // wn0.a
            public final Object invoke() {
                return JavaScriptTypedArray.kind_delegate$lambda$1(this.f63371a);
            }
        });
        this.length = m.b(new wn0.a() { // from class: expo.modules.kotlin.jni.d
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(JavaScriptTypedArray.length_delegate$lambda$2(this.f63372a));
            }
        });
        this.byteLength = m.b(new wn0.a() { // from class: expo.modules.kotlin.jni.e
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(JavaScriptTypedArray.byteLength_delegate$lambda$3(this.f63373a));
            }
        });
        this.byteOffset = m.b(new wn0.a() { // from class: expo.modules.kotlin.jni.f
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(JavaScriptTypedArray.byteOffset_delegate$lambda$4(this.f63374a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int byteLength_delegate$lambda$3(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("byteLength").getDouble();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int byteOffset_delegate$lambda$4(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("byteOffset").getDouble();
    }

    private final native int getRawKind();

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypedArrayKind kind_delegate$lambda$1(JavaScriptTypedArray javaScriptTypedArray) {
        int rawKind = javaScriptTypedArray.getRawKind();
        for (TypedArrayKind typedArrayKind : TypedArrayKind.values()) {
            if (typedArrayKind.getValue() == rawKind) {
                return typedArrayKind;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int length_delegate$lambda$2(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("length").getDouble();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getByteLength() {
        return ((Number) this.byteLength.getValue()).intValue();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getByteOffset() {
        return ((Number) this.byteOffset.getValue()).intValue();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public TypedArrayKind getKind() {
        return (TypedArrayKind) this.kind.getValue();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getLength() {
        return ((Number) this.length.getValue()).intValue();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void read(byte[] buffer, int position, int size);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native short read2Byte(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native int read4Byte(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native long read8Byte(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native byte readByte(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native double readDouble(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native float readFloat(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native ByteBuffer toDirectBuffer();

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void write(byte[] buffer, int position, int size);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void write2Byte(int position, short value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void write4Byte(int position, int value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void write8Byte(int position, long value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void writeByte(int position, byte value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void writeDouble(int position, double value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void writeFloat(int position, float value);
}
