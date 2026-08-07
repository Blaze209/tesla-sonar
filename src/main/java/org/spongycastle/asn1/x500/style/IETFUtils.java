package org.spongycastle.asn1.x500.style;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.DERUniversalString;
import org.spongycastle.asn1.x500.AttributeTypeAndValue;
import org.spongycastle.asn1.x500.RDN;
import org.spongycastle.asn1.x500.X500NameBuilder;
import org.spongycastle.asn1.x500.X500NameStyle;
import org.spongycastle.util.Encodable;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class IETFUtils {
    public static void appendRDN(StringBuffer stringBuffer, RDN rdn, Hashtable hashtable) {
        if (!rdn.isMultiValued()) {
            if (rdn.getFirst() != null) {
                appendTypeAndValue(stringBuffer, rdn.getFirst(), hashtable);
                return;
            }
            return;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        boolean z11 = true;
        for (int i11 = 0; i11 != typesAndValues.length; i11++) {
            if (z11) {
                z11 = false;
            } else {
                stringBuffer.append('+');
            }
            appendTypeAndValue(stringBuffer, typesAndValues[i11], hashtable);
        }
    }

    public static void appendTypeAndValue(StringBuffer stringBuffer, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String str = (String) hashtable.get(attributeTypeAndValue.getType());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(attributeTypeAndValue.getType().getId());
        }
        stringBuffer.append('=');
        stringBuffer.append(valueToString(attributeTypeAndValue.getValue()));
    }

    private static boolean atvAreEqual(AttributeTypeAndValue attributeTypeAndValue, AttributeTypeAndValue attributeTypeAndValue2) {
        if (attributeTypeAndValue == attributeTypeAndValue2) {
            return true;
        }
        return attributeTypeAndValue != null && attributeTypeAndValue2 != null && attributeTypeAndValue.getType().equals(attributeTypeAndValue2.getType()) && canonicalize(valueToString(attributeTypeAndValue.getValue())).equals(canonicalize(valueToString(attributeTypeAndValue2.getValue())));
    }

    private static String bytesToString(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            cArr[i11] = (char) (bArr[i11] & 255);
        }
        return new String(cArr);
    }

    public static String canonicalize(String str) {
        String lowerCase = Strings.toLowerCase(str);
        int i11 = 0;
        if (lowerCase.length() > 0 && lowerCase.charAt(0) == '#') {
            Encodable encodableDecodeObject = decodeObject(lowerCase);
            if (encodableDecodeObject instanceof ASN1String) {
                lowerCase = Strings.toLowerCase(((ASN1String) encodableDecodeObject).getString());
            }
        }
        if (lowerCase.length() > 1) {
            while (true) {
                int i12 = i11 + 1;
                if (i12 >= lowerCase.length() || lowerCase.charAt(i11) != '\\' || lowerCase.charAt(i12) != ' ') {
                    break;
                }
                i11 += 2;
            }
            int length = lowerCase.length() - 1;
            while (true) {
                int i13 = length - 1;
                if (i13 <= 0 || lowerCase.charAt(i13) != '\\' || lowerCase.charAt(length) != ' ') {
                    break;
                }
                length -= 2;
            }
            if (i11 > 0 || length < lowerCase.length() - 1) {
                lowerCase = lowerCase.substring(i11, length + 1);
            }
        }
        return stripInternalSpaces(lowerCase);
    }

    private static int convertHex(char c11) {
        if ('0' > c11 || c11 > '9') {
            return ('a' > c11 || c11 > 'f') ? c11 - '7' : c11 - 'W';
        }
        return c11 - '0';
    }

    public static ASN1ObjectIdentifier decodeAttrName(String str, Hashtable hashtable) {
        if (Strings.toUpperCase(str).startsWith("OID.")) {
            return new ASN1ObjectIdentifier(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new ASN1ObjectIdentifier(str);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) hashtable.get(Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException("Unknown object id - " + str + " - passed to distinguished name");
    }

    private static ASN1Primitive decodeObject(String str) {
        try {
            return ASN1Primitive.fromByteArray(Hex.decode(str.substring(1)));
        } catch (IOException e11) {
            throw new IllegalStateException("unknown encoding in name: " + e11);
        }
    }

    public static String[] findAttrNamesForOID(ASN1ObjectIdentifier aSN1ObjectIdentifier, Hashtable hashtable) {
        Enumeration enumerationElements = hashtable.elements();
        int i11 = 0;
        int i12 = 0;
        while (enumerationElements.hasMoreElements()) {
            if (aSN1ObjectIdentifier.equals(enumerationElements.nextElement())) {
                i12++;
            }
        }
        String[] strArr = new String[i12];
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            if (aSN1ObjectIdentifier.equals(hashtable.get(str))) {
                strArr[i11] = str;
                i11++;
            }
        }
        return strArr;
    }

    private static boolean isHexDigit(char c11) {
        if ('0' <= c11 && c11 <= '9') {
            return true;
        }
        if ('a' > c11 || c11 > 'f') {
            return 'A' <= c11 && c11 <= 'F';
        }
        return true;
    }

    public static boolean rDNAreEqual(RDN rdn, RDN rdn2) {
        if (!rdn.isMultiValued()) {
            if (rdn2.isMultiValued()) {
                return false;
            }
            return atvAreEqual(rdn.getFirst(), rdn2.getFirst());
        }
        if (!rdn2.isMultiValued()) {
            return false;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        AttributeTypeAndValue[] typesAndValues2 = rdn2.getTypesAndValues();
        if (typesAndValues.length != typesAndValues2.length) {
            return false;
        }
        for (int i11 = 0; i11 != typesAndValues.length; i11++) {
            if (!atvAreEqual(typesAndValues[i11], typesAndValues2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static RDN[] rDNsFromString(String str, X500NameStyle x500NameStyle) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str);
        X500NameBuilder x500NameBuilder = new X500NameBuilder(x500NameStyle);
        while (x500NameTokenizer.hasMoreTokens()) {
            String strNextToken = x500NameTokenizer.nextToken();
            if (strNextToken.indexOf(43) > 0) {
                X500NameTokenizer x500NameTokenizer2 = new X500NameTokenizer(strNextToken, '+');
                X500NameTokenizer x500NameTokenizer3 = new X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                String strNextToken2 = x500NameTokenizer3.nextToken();
                if (!x500NameTokenizer3.hasMoreTokens()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                String strNextToken3 = x500NameTokenizer3.nextToken();
                ASN1ObjectIdentifier aSN1ObjectIdentifierAttrNameToOID = x500NameStyle.attrNameToOID(strNextToken2.trim());
                if (x500NameTokenizer2.hasMoreTokens()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    vector.addElement(aSN1ObjectIdentifierAttrNameToOID);
                    vector2.addElement(unescape(strNextToken3));
                    while (x500NameTokenizer2.hasMoreTokens()) {
                        X500NameTokenizer x500NameTokenizer4 = new X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                        String strNextToken4 = x500NameTokenizer4.nextToken();
                        if (!x500NameTokenizer4.hasMoreTokens()) {
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        String strNextToken5 = x500NameTokenizer4.nextToken();
                        vector.addElement(x500NameStyle.attrNameToOID(strNextToken4.trim()));
                        vector2.addElement(unescape(strNextToken5));
                    }
                    x500NameBuilder.addMultiValuedRDN(toOIDArray(vector), toValueArray(vector2));
                } else {
                    x500NameBuilder.addRDN(aSN1ObjectIdentifierAttrNameToOID, unescape(strNextToken3));
                }
            } else {
                X500NameTokenizer x500NameTokenizer5 = new X500NameTokenizer(strNextToken, '=');
                String strNextToken6 = x500NameTokenizer5.nextToken();
                if (!x500NameTokenizer5.hasMoreTokens()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                x500NameBuilder.addRDN(x500NameStyle.attrNameToOID(strNextToken6.trim()), unescape(x500NameTokenizer5.nextToken()));
            }
        }
        return x500NameBuilder.build().getRDNs();
    }

    public static String stripInternalSpaces(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i11 = 1;
            while (i11 < str.length()) {
                char cCharAt2 = str.charAt(i11);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i11++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static ASN1ObjectIdentifier[] toOIDArray(Vector vector) {
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i11 = 0; i11 != size; i11++) {
            aSN1ObjectIdentifierArr[i11] = (ASN1ObjectIdentifier) vector.elementAt(i11);
        }
        return aSN1ObjectIdentifierArr;
    }

    private static String[] toValueArray(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i11 = 0; i11 != size; i11++) {
            strArr[i11] = (String) vector.elementAt(i11);
        }
        return strArr;
    }

    private static String unescape(String str) {
        int i11;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i11 = 2;
        } else {
            i11 = 0;
        }
        boolean z11 = false;
        int length = 0;
        boolean z12 = false;
        boolean z13 = false;
        char c11 = 0;
        while (i11 != charArray.length) {
            char c12 = charArray[i11];
            if (c12 != ' ') {
                z13 = true;
            }
            if (c12 != '\"') {
                if (c12 == '\\' && !z11 && !z12) {
                    length = stringBuffer.length();
                    z11 = true;
                } else if (c12 != ' ' || z11 || z13) {
                    if (!z11 || !isHexDigit(c12)) {
                        stringBuffer.append(c12);
                    } else if (c11 != 0) {
                        stringBuffer.append((char) ((convertHex(c11) * 16) + convertHex(c12)));
                        z11 = false;
                        c11 = 0;
                    } else {
                        c11 = c12;
                    }
                }
                i11++;
            } else if (z11) {
                stringBuffer.append(c12);
            } else {
                z12 = !z12;
            }
            z11 = false;
            i11++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && length != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static ASN1Encodable valueFromHexString(String str, int i11) {
        int length = (str.length() - i11) / 2;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 != length; i12++) {
            int i13 = (i12 * 2) + i11;
            char cCharAt = str.charAt(i13);
            char cCharAt2 = str.charAt(i13 + 1);
            bArr[i12] = (byte) (convertHex(cCharAt2) | (convertHex(cCharAt) << 4));
        }
        return ASN1Primitive.fromByteArray(bArr);
    }

    public static String valueToString(ASN1Encodable aSN1Encodable) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(aSN1Encodable instanceof ASN1String) || (aSN1Encodable instanceof DERUniversalString)) {
            try {
                stringBuffer.append("#" + bytesToString(Hex.encode(aSN1Encodable.toASN1Primitive().getEncoded("DER"))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((ASN1String) aSN1Encodable).getString();
            if (string.length() <= 0 || string.charAt(0) != '#') {
                stringBuffer.append(string);
            } else {
                stringBuffer.append("\\" + string);
            }
        }
        int length = stringBuffer.length();
        int i11 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i11 != length) {
            if (stringBuffer.charAt(i11) == ',' || stringBuffer.charAt(i11) == '\"' || stringBuffer.charAt(i11) == '\\' || stringBuffer.charAt(i11) == '+' || stringBuffer.charAt(i11) == '=' || stringBuffer.charAt(i11) == '<' || stringBuffer.charAt(i11) == '>' || stringBuffer.charAt(i11) == ';') {
                stringBuffer.insert(i11, "\\");
                i11++;
                length++;
            }
            i11++;
        }
        if (stringBuffer.length() > 0) {
            for (int i12 = 0; stringBuffer.length() > i12 && stringBuffer.charAt(i12) == ' '; i12 += 2) {
                stringBuffer.insert(i12, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, CoreConstants.ESCAPE_CHAR);
        }
        return stringBuffer.toString();
    }
}
