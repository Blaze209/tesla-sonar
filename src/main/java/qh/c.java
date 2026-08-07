package qh;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static byte[] a(int i11) {
        return new byte[]{(byte) ((i11 >> 24) % 256), (byte) ((i11 >> 16) % 256), (byte) ((i11 >> 8) % 256), (byte) (i11 % 256)};
    }
}
