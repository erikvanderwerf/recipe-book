package com.gmail.eski787.recipebook.ui.index

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmail.eski787.recipebook.R
import com.gmail.eski787.recipebook.data.OpenRecipeIdentifier

class IndexedItemDetailFragment : Fragment() {
    companion object {
        const val TAG = "IndexDetailFragment"
        private const val ARG_IDENTIFIER = "identifier"

        fun newInstance(identifier: OpenRecipeIdentifier): IndexedItemDetailFragment {
            val args = Bundle()
            args.putString(ARG_IDENTIFIER, identifier)

            val indexDetailFragment = IndexedItemDetailFragment()
            indexDetailFragment.arguments = args
            return indexDetailFragment
        }
    }

    private lateinit var viewModel: IndexedItemDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.index_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(IndexedItemDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}