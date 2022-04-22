import axios from "axios";
import { GET_POSTS, GET_POSTS_ERROR, RESET_POSTS } from "./types";

export const getPosts = () => async (dispatch: any) => {
  try {
    const res = await axios.get("https://jsonplaceholder.typicode.com/posts/");
    dispatch({
      type: GET_POSTS,
      payload: res.data.slice(0, 3),
    });
  } catch (err) {
    dispatch({
      type: GET_POSTS_ERROR,
      payload: err,
    });
  }
};

export const resetPosts = () => async (dispatch: any) => {
  dispatch({
    type: RESET_POSTS,
  });
};
