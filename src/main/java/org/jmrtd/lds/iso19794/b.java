package org.jmrtd.lds.iso19794;

import br0.d;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import zq0.i;

/* JADX INFO: loaded from: classes10.dex */
public class b extends d<a> implements zq0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f99327e = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f99328d;

    public b(i iVar, InputStream inputStream) throws IOException {
        this.f99328d = iVar;
        e(inputStream);
    }

    @Override // br0.c
    public void a(OutputStream outputStream) throws IOException {
        List<a> listC = c();
        Iterator<a> it = listC.iterator();
        long jP = 0;
        while (it.hasNext()) {
            jP += it.next().p();
        }
        long j11 = ((long) 14) + jP;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(1178682112);
        dataOutputStream.writeInt(808529920);
        dataOutputStream.writeInt((int) (4294967295L & j11));
        dataOutputStream.writeShort(listC.size());
        Iterator<a> it2 = listC.iterator();
        while (it2.hasNext()) {
            it2.next().w(dataOutputStream);
        }
    }

    public List<a> d() {
        return c();
    }

    public void e(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int i11 = dataInputStream.readInt();
        if (i11 != 1178682112) {
            f99327e.log(Level.WARNING, "'FAC' marker expected! Found " + Integer.toHexString(i11));
            if (i11 == 12) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(i11);
                short s11 = dataInputStream.readShort();
                dataOutputStream.writeShort(s11);
                int i12 = 0;
                while (i12 < s11) {
                    byte[] bArr = new byte[2048];
                    int i13 = dataInputStream.read(bArr);
                    if (i13 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr);
                    i12 += i13;
                }
                b(new a(net.sf.scuba.data.a.UNKNOWN, a.EnumC2115a.UNSPECIFIED, 0, 0, 0, new int[]{0, 0, 0}, new int[]{0, 0, 0}, 1, 0, 0, 0, 0, new a.b[0], 0, 0, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), s11, 1));
                return;
            }
        }
        int i14 = dataInputStream.readInt();
        if (i14 != 808529920) {
            throw new IllegalArgumentException("'010' version number expected! Found " + Integer.toHexString(i14));
        }
        long j11 = (((long) dataInputStream.readInt()) & 4294967295L) - 14;
        int unsignedShort = dataInputStream.readUnsignedShort();
        long jP = 0;
        for (int i15 = 0; i15 < unsignedShort; i15++) {
            a aVar = new a(inputStream);
            jP += aVar.p();
            b(aVar);
        }
        if (j11 != jP) {
            f99327e.warning("ConstructedDataLength and dataLength differ: dataLength = " + j11 + ", constructedDataLength = " + jP);
        }
    }

    @Override // br0.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        i iVar = this.f99328d;
        if (iVar == null) {
            return bVar.f99328d == null;
        }
        i iVar2 = bVar.f99328d;
        return iVar == iVar2 || iVar.equals(iVar2);
    }

    @Override // br0.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        i iVar = this.f99328d;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    @Override // zq0.a
    public i k1() {
        if (this.f99328d == null) {
            TreeMap treeMap = new TreeMap();
            treeMap.put(Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE), new byte[]{2});
            treeMap.put(Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE), new byte[]{0});
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 8});
            this.f99328d = new i(treeMap);
        }
        return this.f99328d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FaceInfo [");
        Iterator<a> it = c().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
