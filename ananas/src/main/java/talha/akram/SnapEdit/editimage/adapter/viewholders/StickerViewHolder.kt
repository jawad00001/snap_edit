package talha.akram.SnapEdit.editimage.adapter.viewholders

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import iamutkarshtiwari.github.io.SnapEdit.R

class StickerViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField
    var image: ImageView = itemView.findViewById(R.id.img)
}