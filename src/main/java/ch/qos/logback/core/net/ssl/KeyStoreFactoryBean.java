package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.util.LocationUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* JADX INFO: loaded from: classes3.dex */
public class KeyStoreFactoryBean {
    private String location;
    private String password;
    private String provider;
    private String type;

    private KeyStore newKeyStore() {
        return getProvider() != null ? KeyStore.getInstance(getType(), getProvider()) : KeyStore.getInstance(getType());
    }

    public KeyStore createKeyStore() {
        if (getLocation() == null) {
            throw new IllegalArgumentException("location is required");
        }
        InputStream inputStreamOpenStream = null;
        try {
            try {
                try {
                    inputStreamOpenStream = FirebasePerfUrlConnection.openStream(LocationUtil.urlForResource(getLocation()));
                    KeyStore keyStoreNewKeyStore = newKeyStore();
                    keyStoreNewKeyStore.load(inputStreamOpenStream, getPassword().toCharArray());
                    if (inputStreamOpenStream != null) {
                        try {
                            inputStreamOpenStream.close();
                            return keyStoreNewKeyStore;
                        } catch (IOException e11) {
                            e11.printStackTrace(System.err);
                        }
                    }
                    return keyStoreNewKeyStore;
                } catch (FileNotFoundException unused) {
                    throw new KeyStoreException(getLocation() + ": file not found");
                } catch (NoSuchProviderException unused2) {
                    throw new NoSuchProviderException("no such keystore provider: " + getProvider());
                }
            } catch (NoSuchAlgorithmException unused3) {
                throw new NoSuchAlgorithmException("no such keystore type: " + getType());
            } catch (Exception e12) {
                throw new KeyStoreException(getLocation() + ": " + e12.getMessage(), e12);
            }
        } catch (Throwable th2) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace(System.err);
                }
            }
            throw th2;
        }
    }

    public String getLocation() {
        return this.location;
    }

    public String getPassword() {
        String str = this.password;
        return str == null ? SSL.DEFAULT_KEYSTORE_PASSWORD : str;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getType() {
        String str = this.type;
        return str == null ? SSL.DEFAULT_KEYSTORE_TYPE : str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
