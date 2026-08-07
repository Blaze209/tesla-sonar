package org.bouncycastle.jcajce.provider.keystore.util;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes9.dex */
public class JKSKeyStoreSpi extends KeyStoreSpi {
    private static final String NOT_IMPLEMENTED_MESSAGE = "BC JKS store is read-only and only supports certificate entries";
    private final Hashtable<String, BCJKSTrustedCertEntry> certificateEntries = new Hashtable<>();
    private final JcaJceHelper helper;

    private static final class BCJKSTrustedCertEntry {
        final Certificate cert;
        final Date date;

        public BCJKSTrustedCertEntry(Date date, Certificate certificate) {
            this.date = date;
            this.cert = certificate;
        }
    }

    private static final class ErasableByteStream extends ByteArrayInputStream {
        public ErasableByteStream(byte[] bArr, int i11, int i12) {
            super(bArr, i11, i12);
        }

        public void erase() {
            Arrays.fill(((ByteArrayInputStream) this).buf, (byte) 0);
        }
    }

    public JKSKeyStoreSpi(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    private void addPassword(Digest digest, char[] cArr) {
        for (int i11 = 0; i11 < cArr.length; i11++) {
            digest.update((byte) (cArr[i11] >> '\b'));
            digest.update((byte) cArr[i11]);
        }
        digest.update(Strings.toByteArray("Mighty Aphrodite"), 0, 16);
    }

    private CertificateFactory createCertFactory(String str) throws CertificateException {
        JcaJceHelper jcaJceHelper = this.helper;
        if (jcaJceHelper == null) {
            return CertificateFactory.getInstance(str);
        }
        try {
            return jcaJceHelper.createCertificateFactory(str);
        } catch (NoSuchProviderException e11) {
            throw new CertificateException(e11.toString());
        }
    }

    private ErasableByteStream validateStream(InputStream inputStream, char[] cArr) throws IOException {
        Digest digest = DigestFactory.getDigest("SHA-1");
        byte[] all = Streams.readAll(inputStream);
        if (cArr == null) {
            return new ErasableByteStream(all, 0, all.length - digest.getDigestSize());
        }
        addPassword(digest, cArr);
        digest.update(all, 0, all.length - digest.getDigestSize());
        int digestSize = digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        digest.doFinal(bArr, 0);
        byte[] bArr2 = new byte[digestSize];
        System.arraycopy(all, all.length - digestSize, bArr2, 0, digestSize);
        if (Arrays.constantTimeAreEqual(bArr, bArr2)) {
            return new ErasableByteStream(all, 0, all.length - digestSize);
        }
        Arrays.fill(all, (byte) 0);
        throw new IOException("password incorrect or store tampered with");
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        Enumeration<String> enumerationKeys;
        synchronized (this.certificateEntries) {
            enumerationKeys = this.certificateEntries.keys();
        }
        return enumerationKeys;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        boolean zContainsKey;
        if (str == null) {
            throw new NullPointerException("alias value is null");
        }
        synchronized (this.certificateEntries) {
            zContainsKey = this.certificateEntries.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        synchronized (this.certificateEntries) {
            try {
                BCJKSTrustedCertEntry bCJKSTrustedCertEntry = this.certificateEntries.get(str);
                if (bCJKSTrustedCertEntry == null) {
                    return null;
                }
                return bCJKSTrustedCertEntry.cert;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        synchronized (this.certificateEntries) {
            try {
                for (Map.Entry<String, BCJKSTrustedCertEntry> entry : this.certificateEntries.entrySet()) {
                    if (entry.getValue().cert.equals(certificate)) {
                        return entry.getKey();
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        synchronized (this.certificateEntries) {
            try {
                BCJKSTrustedCertEntry bCJKSTrustedCertEntry = this.certificateEntries.get(str);
                if (bCJKSTrustedCertEntry == null) {
                    return null;
                }
                return bCJKSTrustedCertEntry.date;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        boolean zContainsKey;
        synchronized (this.certificateEntries) {
            zContainsKey = this.certificateEntries.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        Hashtable hashtable;
        if (inputStream == null) {
            return;
        }
        ErasableByteStream erasableByteStreamValidateStream = validateStream(inputStream, cArr);
        synchronized (this.certificateEntries) {
            try {
                DataInputStream dataInputStream = new DataInputStream(erasableByteStreamValidateStream);
                int i11 = dataInputStream.readInt();
                int i12 = dataInputStream.readInt();
                if (i11 == -17957139) {
                    CertificateFactory certificateFactoryCreateCertFactory = null;
                    int i13 = 2;
                    if (i12 == 1) {
                        hashtable = null;
                        certificateFactoryCreateCertFactory = createCertFactory("X.509");
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("unable to discern store version");
                        }
                        hashtable = new Hashtable();
                    }
                    int i14 = dataInputStream.readInt();
                    int i15 = 0;
                    while (i15 < i14) {
                        int i16 = dataInputStream.readInt();
                        if (i16 == 1) {
                            throw new IOException(NOT_IMPLEMENTED_MESSAGE);
                        }
                        if (i16 != i13) {
                            throw new IllegalStateException("unable to discern entry type");
                        }
                        String utf = dataInputStream.readUTF();
                        Date date = new Date(dataInputStream.readLong());
                        if (i12 == i13) {
                            String utf2 = dataInputStream.readUTF();
                            if (hashtable.containsKey(utf2)) {
                                certificateFactoryCreateCertFactory = (CertificateFactory) hashtable.get(utf2);
                            } else {
                                CertificateFactory certificateFactoryCreateCertFactory2 = createCertFactory(utf2);
                                hashtable.put(utf2, certificateFactoryCreateCertFactory2);
                                certificateFactoryCreateCertFactory = certificateFactoryCreateCertFactory2;
                            }
                        }
                        int i17 = dataInputStream.readInt();
                        byte[] bArr = new byte[i17];
                        dataInputStream.readFully(bArr);
                        ErasableByteStream erasableByteStream = new ErasableByteStream(bArr, 0, i17);
                        try {
                            Certificate certificateGenerateCertificate = certificateFactoryCreateCertFactory.generateCertificate(erasableByteStream);
                            if (erasableByteStream.available() != 0) {
                                throw new IOException("password incorrect or store tampered with");
                            }
                            erasableByteStream.erase();
                            this.certificateEntries.put(utf, new BCJKSTrustedCertEntry(date, certificateGenerateCertificate));
                            i15++;
                            i13 = 2;
                        } catch (Throwable th2) {
                            erasableByteStream.erase();
                            throw th2;
                        }
                    }
                }
                if (erasableByteStreamValidateStream.available() != 0) {
                    throw new IOException("password incorrect or store tampered with");
                }
                erasableByteStreamValidateStream.erase();
            } catch (Throwable th3) {
                erasableByteStreamValidateStream.erase();
                throw th3;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int i11 = dataInputStream.readInt();
        int i12 = dataInputStream.readInt();
        if (i11 == -17957139) {
            return i12 == 1 || i12 == 2;
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.certificateEntries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        throw new IOException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else {
            if (loadStoreParameter instanceof BCLoadStoreParameter) {
                engineLoad(((BCLoadStoreParameter) loadStoreParameter).getInputStream(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }
}
