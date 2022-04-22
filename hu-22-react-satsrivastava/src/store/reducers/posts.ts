import { GET_POSTS, GET_POSTS_ERROR, RESET_POSTS } from "../actions/types";

export interface IPosts {
  loading: boolean;
  data: any[];
}

const initialState = {
  loading: true,
  data: [],
};

function postReducer(
  state = initialState,
  action: { type: any; payload: any }
) {
  switch (action.type) {
    case GET_POSTS:
      return {
        ...state,
        loading: false,
        data: action.payload,
      };
    case RESET_POSTS:
      return {
        ...state,
        loading: false,
        data: [],
      };
    case GET_POSTS_ERROR:
      return {
        ...state,
        loading: false,
        data: [],
      };
    default:
      return state;
  }
}

export default postReducer;
