package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.KeyType;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
public class Key extends BinaryProperty<KeyType> {
    private String text;

    public Key() {
    }

    @Override // ezvcard.property.BinaryProperty, ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.url == null && this.data == null && this.text == null) {
            list.add(new d(8, new Object[0]));
        }
        if (this.url != null) {
            if (vCardVersion == VCardVersion.V2_1 || vCardVersion == VCardVersion.V3_0) {
                list.add(new d(15, new Object[0]));
            }
        }
    }

    @Override // ezvcard.property.BinaryProperty, ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Key key = (Key) obj;
        String str = this.text;
        if (str == null) {
            if (key.text != null) {
                return false;
            }
        } else if (!str.equals(key.text)) {
            return false;
        }
        return true;
    }

    public String getText() {
        return this.text;
    }

    @Override // ezvcard.property.BinaryProperty, ezvcard.property.VCardProperty
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.text;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public void setText(String str, KeyType keyType) {
        this.text = str;
        this.data = null;
        this.url = null;
        setContentType(keyType);
    }

    @Override // ezvcard.property.BinaryProperty, ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        Map<String, Object> stringValues = super.toStringValues();
        stringValues.put("text", this.text);
        return stringValues;
    }

    public Key(byte[] bArr, KeyType keyType) {
        super(bArr, keyType);
    }

    @Override // ezvcard.property.VCardProperty
    public Key copy() {
        return new Key(this);
    }

    @Override // ezvcard.property.BinaryProperty
    public void setData(byte[] bArr, KeyType keyType) {
        super.setData(bArr, keyType);
        this.text = null;
    }

    @Override // ezvcard.property.BinaryProperty
    public void setUrl(String str, KeyType keyType) {
        super.setUrl(str, keyType);
        this.text = null;
    }

    public Key(String str, KeyType keyType) {
        super(str, keyType);
    }

    public Key(InputStream inputStream, KeyType keyType) {
        super(inputStream, keyType);
    }

    public Key(File file, KeyType keyType) {
        super(file, keyType);
    }

    public Key(Key key) {
        super(key);
        this.text = key.text;
    }
}
