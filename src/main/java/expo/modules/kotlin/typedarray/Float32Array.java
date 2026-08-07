package expo.modules.kotlin.typedarray;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import expo.modules.kotlin.jni.TypedArrayKind;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b/\u00100J \u00101\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b1\u00102J \u00103\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b3\u0010\u0010J \u00104\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0014\u0010C\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010>¨\u0006D"}, d2 = {"Lexpo/modules/kotlin/typedarray/Float32Array;", "Lexpo/modules/kotlin/typedarray/TypedArray;", "Lexpo/modules/kotlin/typedarray/GenericTypedArray;", "", "Lexpo/modules/kotlin/typedarray/RawTypedArrayHolder;", "Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "rawArray", "<init>", "(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", "", "index", "get", "(I)Ljava/lang/Float;", "value", "Ljn0/h0;", "set", "(IF)V", "Ljava/nio/ByteBuffer;", "toDirectBuffer", "()Ljava/nio/ByteBuffer;", "", "buffer", "position", "size", "read", "([BII)V", "write", "", "readByte", "(I)B", "", "read2Byte", "(I)S", "read4Byte", "(I)I", "", "read8Byte", "(I)J", "readFloat", "(I)F", "", "readDouble", "(I)D", "writeByte", "(IB)V", "write2Byte", "(IS)V", "write4Byte", "(II)V", "write8Byte", "(IJ)V", "writeFloat", "writeDouble", "(ID)V", "Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "getRawArray", "()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "Lexpo/modules/kotlin/jni/TypedArrayKind;", "getKind", "()Lexpo/modules/kotlin/jni/TypedArrayKind;", "kind", "getLength", "()I", "length", "getByteLength", "byteLength", "getByteOffset", "byteOffset", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Float32Array implements TypedArray, GenericTypedArray<Float>, RawTypedArrayHolder {
    private final JavaScriptTypedArray rawArray;

    public Float32Array(JavaScriptTypedArray rawArray) {
        s.k(rawArray, "rawArray");
        this.rawArray = rawArray;
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getByteLength() {
        return this.rawArray.getByteLength();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getByteOffset() {
        return this.rawArray.getByteOffset();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public TypedArrayKind getKind() {
        return this.rawArray.getKind();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getLength() {
        return this.rawArray.getLength();
    }

    @Override // expo.modules.kotlin.typedarray.RawTypedArrayHolder
    public JavaScriptTypedArray getRawArray() {
        return this.rawArray;
    }

    @Override // expo.modules.kotlin.typedarray.GenericTypedArray, java.lang.Iterable
    public Iterator<Float> iterator() {
        return GenericTypedArray.DefaultImpls.iterator(this);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public void read(byte[] buffer, int position, int size) {
        s.k(buffer, "buffer");
        this.rawArray.read(buffer, position, size);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public short read2Byte(int position) {
        return this.rawArray.read2Byte(position);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int read4Byte(int position) {
        return this.rawArray.read4Byte(position);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public long read8Byte(int position) {
        return this.rawArray.read8Byte(position);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public byte readByte(int position) {
        return this.rawArray.readByte(position);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public double readDouble(int position) {
        return this.rawArray.readDouble(position);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public float readFloat(int position) {
        return this.rawArray.readFloat(position);
    }

    @Override // expo.modules.kotlin.typedarray.GenericTypedArray
    public /* bridge */ /* synthetic */ void set(int i11, Float f11) {
        set(i11, f11.floatValue());
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public ByteBuffer toDirectBuffer() {
        return this.rawArray.toDirectBuffer();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public void write(byte[] buffer, int position, int size) {
        s.k(buffer, "buffer");
        this.rawArray.write(buffer, position, size);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public void write2Byte(int position, short value) {
        this.rawArray.write2Byte(position, value);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public void write4Byte(int position, int value) {
        this.rawArray.write4Byte(position, value);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public void write8Byte(int position, long value) {
        this.rawArray.write8Byte(position, value);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public void writeByte(int position, byte value) {
        this.rawArray.writeByte(position, value);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public void writeDouble(int position, double value) {
        this.rawArray.writeDouble(position, value);
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public void writeFloat(int position, float value) {
        this.rawArray.writeFloat(position, value);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.typedarray.GenericTypedArray
    public Float get(int index) {
        if (index < 0 || index >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return Float.valueOf(readFloat(index * 4));
    }

    public void set(int index, float value) {
        if (index < 0 || index >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        writeFloat(index * 4, value);
    }
}
