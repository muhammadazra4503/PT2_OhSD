package org.d3ifcool3046.pt2

import android.os.Parcel
import android.os.Parcelable

data class Rumus(val image:Int, val name:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Rumus> {
        override fun createFromParcel(parcel: Parcel): Rumus {
            return Rumus(parcel)
        }

        override fun newArray(size: Int): Array<Rumus?> {
            return arrayOfNulls(size)
        }
    }
}

