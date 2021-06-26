package com.example.strawberrydrink.data.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.strawberrydrink.data.DrinkRemoteEntity

class DrinkAdapter: RecyclerView.Adapter<DrinkAdapter.DrinkRecyclerViewHolder>() {
    var ListDrinks = listOf<DrinkRemoteEntity>()

    inner class DrinkRecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        //private val titleContainer: TextView = itemView.findViewById(R.id.textTitle)
       // private val desciptionContainer: TextView = itemView.findViewById(R.id.textDescription)
        //private val level = itemView.findViewById(R.id.viewColor) as View

        fun bind(Drink: DrinkRemoteEntity) { /*Trata Informações do banco de dados*/
            titleContainer.text = Drink.strDrink
            desciptionContainer.text = Drink.strDrinkThumb

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnedItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.activity_learned_item, parent,false)
        /*O inflate que cria a view nova - se quiser fazer uma view a partir de um fragment/activity usa o inflater  */
        /*O onCreateViewHolder é quem escolhe qual tela/view vai ser o modelo de renderização*/

        return LearnedItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: LearnedItemViewHolder, position: Int) {
        /*holder sabe qual layout vai trabalhar*/
        /*O holder pega a tela criada e com os dados inseridos faz a renderização com base na posição */
        val learnedItem = learnItems[position]
        holder.bind(learnedItem)
    }

    override fun getItemCount(): Int {
        return learnItems.size /*Conta quantos itens serão renderizados*/
    }
}