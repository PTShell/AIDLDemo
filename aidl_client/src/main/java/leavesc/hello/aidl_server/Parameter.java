package leavesc.hello.aidl_server;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 作者：leavesC
 * 时间：2019/4/4 10:45
 * 描述：包含一个进行运算操作的 int 类型数据
 */
public class Parameter implements Parcelable {

    public static final Creator<Parameter> CREATOR = new Creator<Parameter>() {
        @Override
        public Parameter createFromParcel(Parcel source) {
            return new Parameter(source);
        }

        @Override
        public Parameter[] newArray(int size) {
            return new Parameter[size];
        }
    };
    private int param;

    public Parameter(int param) {
        this.param = param;
    }

    protected Parameter(Parcel in) {
        this.param = in.readInt();
    }

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.param);
    }

}
